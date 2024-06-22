package com.itshala.Controller;
import com.itshala.Model.Student;
import com.itshala.Service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

@WebServlet("/student")

public class StudentController extends HttpServlet {
    StudentService studentService = new StudentService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        Date dob = Date.valueOf((req.getParameter("dob")));
        String nationality = req.getParameter("nationality");

        Student student = Student.builder()
                .studentName(name)
                .studentAddress(address)
                .studentPhone(phone)
                .studentEmail(email)
                .studentGender(gender)
                .studentDob(dob)
                .studentNationality(nationality)
                .build();
        studentService.addStudent(student);

        PrintWriter writer = resp.getWriter();
        writer.println("Student added successfully");
    }
}





