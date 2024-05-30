package com.example.ApSpring29.onetoone.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Aadhar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long number;

    @OneToOne(mappedBy = "aadhar")
    private Person person;

    public void setNumber(Number number) {
    }
}