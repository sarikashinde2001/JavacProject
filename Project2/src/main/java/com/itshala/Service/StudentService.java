package com.itshala.Service;
import com.itshala.Dao.StudentDao;
import com.itshala.Model.Student;

import java.util.List;

public class StudentService {
    static StudentDao studentDao=new StudentDao();

    public static void addStudent(Student student){
        studentDao.addStudent(student);
    }
    public List<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
    public void deleteStudent(int studentId) {
        studentDao.deleteStudent(studentId);
    }
}


