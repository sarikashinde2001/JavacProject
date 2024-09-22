package com.itshala.Service;

import com.itshala.Dao.CourseDao;
import com.itshala.Model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CourseService {
//    @Autowired
    CourseDao courseDao;
    public void addCourse(Course course) {courseDao.addCourse(course);
    }
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    public void deleteCourse(int courseId) {courseDao.deleteCourse(courseId);
    }
    public List<Course> getAllCourse() {return courseDao .getAllCourse();
    }

}
