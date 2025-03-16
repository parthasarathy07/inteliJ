package com.java.oops.instanceAndStaticBlock;

public class Child {
    static {
        System.out.println("It is child static");
    }
    static int i=0;

    public static void main(String[] args) {
        System.out.println("child main");
    }
}
