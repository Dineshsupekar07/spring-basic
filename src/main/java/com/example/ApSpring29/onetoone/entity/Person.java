package com.example.ApSpring29.onetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @OneToOne
    @JoinColumn(name = "aadhar_id")
    private Aadhar aadhar;

    public SpinnerNumberModel getAadhar() {
        return null;
    }

    public void setAadhar(Aadhar aadhar) {
    }

    public Object getAddress() {
        return null;
    }

    public Aadhar getName() {
        return null;
    }

    public void setAddress(Object address) {
    }

    public void setName(Aadhar name) {
    }
}
