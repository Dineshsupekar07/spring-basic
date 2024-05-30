package com.example.ApSpring29.manytomany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String courseName;

    private  String courseCode;
}
