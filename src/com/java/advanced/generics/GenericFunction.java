package com.java.advanced.generics;

import java.util.ArrayList;

public class GenericFunction {
    public static void main(String[] args) {
        function(2,"queen");
        ArrayList<Number> list=new ArrayList<>();
        list.add(20);
        list.add(38.3);


        Number ob =9;
        ob=8.9;
    }
    public static <T,U> void function(T val1,U val2){
        System.out.println(val1);
        System.out.println(val2);
    }
}
