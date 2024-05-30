package com.example.ApSpring29.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Human {
    //

    @Before(value = "execution (public void com.example.ApSpring29.aop.Boy.study())")

    public void WackUp(){
        System.out.println("wackUp");
    }

    @After(value = "execution (public void  study())")
    public void sleep(){
        System.out.println("sleep");
    }

}
