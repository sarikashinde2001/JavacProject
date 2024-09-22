package com.itshala.Dao;

import com.itshala.Model.Course;
import com.itshala.Util.ConnectionUtil;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void createCourse(Course course) {
        Connection connection= ConnectionUtil.getConnection();
        String query="insert into itshala.course(id,course_name,price)VALUES (?,?,?)";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,course.getCourseId());
            preparedStatement.setString(2,course.getCourseName());
            preparedStatement.setInt(3,course.getCoursePrice());
            preparedStatement.executeUpdate();
            System.out.println("record added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void updateCourse(Course course){
        Connection connection=ConnectionUtil.getConnection();
        String query="update itshala.course set course_name=?,price=? where id=?";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,course.getCourseName());
            preparedStatement.setInt(2,course.getCoursePrice());
            preparedStatement.setInt(3,course.getCourseId());
            preparedStatement.executeUpdate();
            System.out.println("update recoed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCourse(int courseId) {
        Connection connection=ConnectionUtil.getConnection();
        String query="delete from itshala.course where id=?";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,courseId);
            preparedStatement.executeUpdate();
            System.out.println("recoed deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public List<Course> getallcourses() {
////
//    public List<Course> getallcourses(){List<Course> courseList=new ArrayList<>();
//        Connection connection=ConnectionUtil.getConnection();
//        String query="select*From itshala.course";
//        try{
//            Statement statement= connection.createStatement();
//           Resultset resultset=statement.executeQuery(query);
//            while (resultset.next()){
//               Course course= Course.builder(
//                       .courseId(resultset.getResultI).build()
//            }
//        }
//        }

}
