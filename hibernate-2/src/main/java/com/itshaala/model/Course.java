package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_price")
    private int coursePrice;


}