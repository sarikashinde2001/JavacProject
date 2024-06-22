package com.itshala.coursemanagementsystem.Dao;
import com.itshala.coursemanagementsystem.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}

