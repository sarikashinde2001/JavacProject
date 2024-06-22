package com.itshala.Controller;
import com.itshala.Service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/deletestudent")

public class DeleteStudent  extends HttpServlet {
    StudentService studentService=new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int studentId=Integer.parseInt(req.getParameter("id"));
        studentService.deleteStudent(studentId);
        PrintWriter writer=resp.getWriter();
        writer.println("record deleted succesfully");
    }
}


