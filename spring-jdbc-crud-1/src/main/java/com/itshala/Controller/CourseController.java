package com.itshala.Controller;

import com.itshala.Model.Course;
import com.itshala.Service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor

public class CourseController {
//    @Autowired
//    CourseService courseService;

//    public void addCourse(Course course){
//        courseService.addCourse(course);
//    }
CourseService courseService;
   public void addCourse(Course course) {
        courseService.addCourse(course);
    }
    public void updateCourse(Course course){
       courseService.updateCourse(course);
    }
    public void deleteCourse(int courseId){courseService.deleteCourse(courseId);
    }
    public List<Course> getAllCourse() {return courseService.getAllCourse();
    }


}
