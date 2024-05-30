package com.example.ApSpring29.manytomany.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
@Setter
@Getter
public class Student1 {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private  String address;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stud_courses", joinColumns = @JoinColumn(name = "stud_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
    private List<Courses> coursesList;
}


