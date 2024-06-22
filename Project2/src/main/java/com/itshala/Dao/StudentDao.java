package com.itshala.Dao;
import com.itshala.Model.Student;
import com.itshala.Util.ConnectionUtil;

import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class StudentDao {
    public void addStudent(Student student){

        Connection connection= ConnectionUtil.getConnection();
        String insertQuery="insert into student_pro.student(student_name,student_address,student_phone,student_email,gender, student_dob,student_nationality) values(?,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentAddress());
            preparedStatement.setString(3, student.getStudentPhone());
            preparedStatement.setString(4,student.getStudentEmail());
            preparedStatement.setString(5,student.getStudentGender());
            preparedStatement.setDate(6,  student.getStudentDob());
            preparedStatement.setString(7,student.getStudentNationality());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Record added");


    }

    public List<Student> getAllStudent() {
        List<Student> studentList=new ArrayList<>();
        Connection connection=ConnectionUtil.getConnection();
        Statement statement=null;
        try{
            statement= connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from student_pro.student");
            while (resultSet.next()){
                Student student = Student.builder()
                        .studentId(resultSet.getInt("student_id"))
                        .studentName(resultSet.getString("student_name"))
                        .studentAddress(resultSet.getString("student_address"))
                        .studentPhone(resultSet.getString("student_phone"))
                        .studentEmail(resultSet.getString("student_email"))
                        .studentGender(resultSet.getString("gender"))
                        .studentDob(resultSet.getDate("student_dob"))
                        .studentNationality(resultSet.getString("student_nationality"))
                        .build();
                studentList.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    public void updateStudent(Student student) {
        Connection connection=ConnectionUtil.getConnection();
        String updateQuery="update student_pro.student set student_name=?,student_address=?,student_phone=?,student_email=?,gender=?,student_dob=?,student_nationality=? where student_id=?";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,student.getStudentName());
            preparedStatement.setString(2,student.getStudentAddress());
            preparedStatement.setString(3,student.getStudentPhone());
            preparedStatement.setString(4,student.getStudentEmail());
            preparedStatement.setString(5,student.getStudentGender());
            preparedStatement.setDate(6, (Date) student.getStudentDob());
            preparedStatement.setString(7,student.getStudentNationality());
            preparedStatement.setInt(8,student.getStudentId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteStudent(int studentId) {
        Connection connection = ConnectionUtil.getConnection();
        String deleteQuery = "delete from student_pro.student where student_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("issue in creating the statement");
        }
    }
}



