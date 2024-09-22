package com.itshala;

import com.itshala.Controller.CourseController;
import com.itshala.Model.Course;

public class App {
    public static void main(String[] args) {
        CourseController courseController=new CourseController();
//        courseController.createCourse(Course.builder()
//                .courseId(555)
//                .courseName("para")
//                .coursePrice(90)
//                .build());
//
//        courseController.updateCourse(Course.builder()
//                .courseId(888)
//                .courseName("saya")
//                .coursePrice(90)
//                .build());
        courseController.deleteCourse(888);
    }


}
