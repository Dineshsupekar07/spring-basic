package com.example.ApSpring29.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MaritalStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String maritalStatus;

    public Long getId(){

        return id;
    }

    public void setId(Long id){

        this.id=id;
    }

    public String getMaritalStatus() {

        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
