package com.java.oops.constructors;

public class Method_overloading {
    static void fun(int i){
        System.out.println(i);
    }
   static void fun(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        fun(2);
        fun("king");
    }
}
