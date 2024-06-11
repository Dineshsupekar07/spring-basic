package com.example.ApSpring29.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Human {
    //

//    @Before(value = "execution (public void com.example.ApSpring29.aop.Boy.study())")
//
//    public void WackUp(){
//        System.out.println("wackUp");
//    }
//
//    @After(value = "execution (public void  study())")
//    public void sleep(){
//        System.out.println("sleep");
//    }
//
//}

    @Pointcut(value = "execution(public int study(..))")
    public void pointcut() {
    }

    @AfterReturning(value = "pointcut()",returning ="value")
    public  void aferRet(int value){
        System.out.println("in after ret ==>"+value);
    }
}