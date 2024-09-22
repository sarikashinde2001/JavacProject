package com.itshaala;

import com.itshaala.Controller.CourseController;
import com.itshaala.model.Course;

public class App {
        public static void main(String[] args) {
            CourseController courseController = new CourseController();
            courseController.addCourse(Course.builder()
                    .courseId(1)
                    .courseName("java")
                    .coursePrice(40000)
                    .build());
        }
        //        courseController.updateCourse(Course.builder()
        //                .courseId(1)
        //                .courseName("python")
        //                .coursePrice(50000)
        //                .build());
        //    }
        //        courseController.deleteCourse(1);
        //    }

}


