package com.example.ApSpring29.ioc;

public class Vadafone implements Sim{
    @Override
    public void calling(){
        System.out.println("in Vadafone callig");
    }
    @Override
    public void msg(){
        System.out.println("in Vadafone msg");
    }

}
