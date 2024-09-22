package com.itshala;
import com.itshala.Controller.CourseController;
import com.itshala.Model.Course;
import com.itshala.Util.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CourseController courseController = applicationContext.getBean(CourseController.class);
//        courseController.addCourse(Course.builder()
//                .courseId(1000)
//                .courseName("raha")
//                .coursePrice(70000)
//                .build());
//        courseController.updateCourse(Course.builder()
//                .courseId(1000)
//                .courseName("ha")
//                .coursePrice(70)
//                .build());
//        courseController.deleteCourse(1000);
        courseController.getAllCourse().forEach(System.out::println);

    }
}
