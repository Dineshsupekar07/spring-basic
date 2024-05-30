package com.example.ApSpring29.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class BloodGroup {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
    private String bloodGroup;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBloodGroup() {

        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }


}
