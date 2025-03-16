package com.java.oops.instanceAndStaticBlock;

public class Base {
    static {
        System.out.println("It is base static");
    }
    public static void main(String[] args) {
        int i=Child.i;
        int k=Child.i;
    }
}
