<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.itshala.Model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Sarika
  Date: 10-03-2024
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Page</title>
</head>
<body>
<%--welcome user,<%=LocalDateTime.now()%>--%>
<hr>
<%
    List<Student> students=(List<Student>) request.getAttribute("students");
    PrintWriter writer=response.getWriter();
    for (Student student:students){
        writer.println(student);
    }
%>

</body>
</html>
