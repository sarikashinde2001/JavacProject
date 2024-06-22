package com.itshala.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil{
    private static Connection connection;
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Application";
            String username="root";
            String password="Sarika@123";
            connection= DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException r){
            System.out.println("class not found");
        }catch(SQLException e){
            System.out.println("issue in query");
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}



