package com.example.ApSpring29.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gender;
    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}




