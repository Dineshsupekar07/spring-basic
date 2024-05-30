package com.example.ApSpring29.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimCofig {
    public SimCofig(){
        System.out.println("In SimConfig");
    }
    @Bean
    public Vadafone getVadafone(){
        return new Vadafone();
    }
    @Bean
    public Jio getJio(){
        return new Jio();
    }

}
