package com.java.oops.abstracting;

public class Son extends Parent{
    Son(int roll){
        this.roll=roll;
    }
    @Override
    void career(){
        System.out.println("my career is coder");
    }
    void name(){
        System.out.println("my name is iron man");
    }
    void age(){
        System.out.println("my age is 18");
    }
}
