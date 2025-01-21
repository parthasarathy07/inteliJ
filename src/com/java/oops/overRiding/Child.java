package com.java.oops.overRiding;

public class Child extends Parent {
    void yesmethod(){
        System.out.println("yesmethod");
    }
    @Override
    void nomethod(){
        System.out.println("there is the thing");
    }
}
