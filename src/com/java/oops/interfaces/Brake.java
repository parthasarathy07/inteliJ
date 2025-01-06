package com.java.oops.interfaces;

public interface Brake {
    String noOfTyres="4 tyres";
    default void start(){
        System.out.println("brake is initiated");
    }
    void stop();
    void brake();
}
