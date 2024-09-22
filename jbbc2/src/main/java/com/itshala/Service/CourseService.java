package com.itshala.Service;

import com.itshala.Dao.CourseDao;
import com.itshala.Model.Course;

import java.util.List;

public class CourseService {
    CourseDao courseDao=new CourseDao();

    public void createCourse(Course course){
        courseDao.createCourse(course);
    }

    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }
    public void deleteCourse(int courseId){
        courseDao.deleteCourse(courseId);
    }
//    public List<Course> getallcourses(){
//        return courseDao.getallcourses();
//    }
}
