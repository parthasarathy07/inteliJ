package com.java.advanced.generics;

public class Main {
    public static void main(String[] args) {

        GenericPrinter<String> s =new GenericPrinter<>("king");
        s.createObjectForObjectClass();
        s.createObjectForTClass();
        s.display();
        GenericPrinter<Integer>I=new GenericPrinter<>(20);
//        GenericPrinter<Number>I1=I;  //error
        GenericPrinter<? extends Number> I2=I;
        GenericPrinter<?> s1=s;

    }
}
