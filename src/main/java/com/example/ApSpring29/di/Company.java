package com.example.ApSpring29.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    @Autowired
    private Employee employee;


    public void display(){
        employee.show();
    }


}
