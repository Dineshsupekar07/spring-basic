package com.example.ApSpring29.aop;

import org.springframework.stereotype.Component;

@Component
public class Boy {

    public int study(int i){
        System.out.println("Boys study");
        return i;
    }
}

