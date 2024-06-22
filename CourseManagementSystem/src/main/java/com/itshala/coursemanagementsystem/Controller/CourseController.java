package com.itshala.coursemanagementsystem.Controller;
import com.itshala.coursemanagementsystem.Model.Course;
import com.itshala.coursemanagementsystem.Service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseController {
    CourseService courseService;

    @PostMapping
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }
    @PutMapping
    public void updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }

    @DeleteMapping
    public void deleteCourse(@RequestBody Course course) {
        courseService.deleteCourse(course);
    }
    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable("id") int id) {
        courseService.deleteCourseById(id);
    }
    @DeleteMapping("/bulk")
    public void deleteAllCourses() {
        courseService.deleteAllCourses();
    }

    @PostMapping("/bulk")
    public void addAllCourses(@RequestBody List<Course> courses) {
        courseService.addAllCourses(courses);
    }
    @PutMapping("/bulk")
    public void updateAllCourses(@RequestBody List<Course> courses) {
        courseService.updateAllCourses(courses);
    }


    @GetMapping
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") int courseId){
        return courseService.getCourseById(courseId);
    }
}

