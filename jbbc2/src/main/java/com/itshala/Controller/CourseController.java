package com.itshala.Controller;

import com.itshala.Model.Course;
import com.itshala.Service.CourseService;

import java.util.List;

public class CourseController {
    CourseService courseService=new CourseService();

    public void createCourse(Course course){
        courseService.createCourse(course);
    }
    public void updateCourse(Course course){
        courseService.updateCourse(course);
    }
    public void deleteCourse(int courseId){
        courseService.deleteCourse(courseId);
    }
//    public List<Course>getallcourses(){
//        return courseService.getallcourses();
//
//    }
}
