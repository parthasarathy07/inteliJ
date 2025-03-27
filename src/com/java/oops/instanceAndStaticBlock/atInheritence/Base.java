package com.java.oops.instanceAndStaticBlock.atInheritence;

public class Base {
    static int i=10;
    static {
        System.out.println("first static");
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("base main");
    }
    static void m1(){
        System.out.println("It is static method");
    }
}
