package com.itshala.Dao;

import com.itshala.Model.Course;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor

public class CourseDao {
    //    @Autowired
     JdbcTemplate jdbcTemplate;
     public void deleteCourse(int courseId) {
         String Sql = "delete from itshala.course where id=?";
        PreparedStatementSetter preparedStatementSetter = preparedStatement -> {
            preparedStatement.setInt(1, courseId);
        };
        System.out.println("course deleted");
    }
    public void addCourse(Course course) {
        String sql="insert into itshala.course(id,course_name,price)values(?,?,?)";
      PreparedStatementSetter preparedStatementSetter=preparedStatement->{
          preparedStatement.setInt(1,course.getCourseId());
          preparedStatement.setString(2,course.getCourseName());
          preparedStatement.setInt(3,course.getCoursePrice());

      };
      jdbcTemplate.update(sql,preparedStatementSetter);
      System.out.println("course created");

    }
    public void updateCourse(Course course) {
        String sql="update itshala.course set course_name=?,price=? where id=?";
        PreparedStatementSetter preparedStatementSetter=preparedStatement->{
            preparedStatement.setInt(1,course.getCourseId());
            preparedStatement.setString(2,course.getCourseName());
            preparedStatement.setInt(3,course.getCoursePrice());
        };
        jdbcTemplate.update(sql,preparedStatementSetter);
        System.out.println("course updated");
    }
    public List<Course> getAllCourse() {
        String sql = "select * from itshala.course";
        ResultSetExtractor<List<Course>> resultSet = (rs -> {
            List<Course> courseList = new ArrayList<>();
            while (rs.next()) {
                Course course = Course.builder()
                        .courseId(rs.getInt("id"))
                        .courseName(rs.getString("course_name"))
                        .coursePrice(rs.getInt("price"))
                        .build();
                courseList.add(course);
            }
            return courseList;
        });
        return jdbcTemplate.query(sql, resultSet);
    }



}
