package com.itshala.Model;
import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String studentPhone;
    private String studentEmail;
    private String studentGender;
    private Date studentDob;
    private String studentNationality;
}


