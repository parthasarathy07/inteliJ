package com.java.oops.abstracting;

public class Daughter extends Parent{
    Daughter (int roll){
        this.roll=roll;
    }
    @Override
    void career() {
        System.out.println("my career is Doctor");
    }

    @Override
    void name() {
        System.out.println("my name is Jarvis");
    }

    @Override
    void age() {
        System.out.println("my age is 20");
    }
}
