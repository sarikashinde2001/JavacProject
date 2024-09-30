package com.itshala.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder


public class Student {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
