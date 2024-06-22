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
import java.util.List;

@WebServlet("/liststudent")
public class Listofstudent extends HttpServlet {
    StudentService studentService=new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students= studentService.getAllStudent();
        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
//        writer.println("list of student");
        /*writer.println("<html><head><title>");
        writer.println("table {border-collapse: collapse;width: 100%;}");
        writer.println("th,td {border: 1px solid black; padding: 8px; text-align: left;}");
        writer.println("</style></head><body>");

         */
        writer.println(("<table><tr> <th>Id</th> <th>Name</th> <th>Address</th> <th>Phone</th> <th>Email</th> <th>Gender</th> <th>Date Of Birth</th> <th>Nationality</th></tr>"));
        for(Student student:students){
            writer.println("<tr>");
            writer.println("<td>" +student.getStudentId() +"</td>");
            writer.println("<td>" +student.getStudentName() +"</td>");
            writer.println("<td>" +student.getStudentAddress() +"</td>");
            writer.println("<td>" +student.getStudentPhone() +"</td>");
            writer.println("<td>" +student.getStudentEmail() +"</td>");
            writer.println("<td>" +student.getStudentGender() +"</td>");
            writer.println("<td>" +student.getStudentDob() +"</td>");
            writer.println("<td>" +student.getStudentNationality()+"</td>");
//            writer.println("<td> Edit = " + student.getStudentId() +"<td>");
            writer.println("</tr>");

        }
        writer.println("</table>");
    }
}



