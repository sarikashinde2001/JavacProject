package com.itshala.coursemanagementsystem.Service;
import com.itshala.coursemanagementsystem.Dao.CourseRepository;
import com.itshala.coursemanagementsystem.Model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseService {
    CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Course course) {
        courseRepository.delete(course);
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int courseId) {
        return courseRepository.findById(courseId).get();
    }

    public void deleteCourseById(int id) {
        courseRepository.deleteById(id);
    }

    public void deleteAllCourses() {
        courseRepository.deleteAll();
    }

    public void addAllCourses(List<Course> courses) {
        courseRepository.saveAll(courses);
    }

    public void updateAllCourses(List<Course> courses) {
        List<Course> coursesPresent = courseRepository.
                findAllById(
                        courses.stream()
                                .map(course -> course.getCourseId())
                                .collect(Collectors.toList()));
        courseRepository.saveAll(coursesPresent);
    }
}