package com.itshala.Service;

import com.itshala.Dao.StudentDao;
import com.itshala.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class StudentService {
    StudentDao studentDao;
    public List<Student> getAllStudent() {
      return  studentDao.getAllStudent();
    }
}
