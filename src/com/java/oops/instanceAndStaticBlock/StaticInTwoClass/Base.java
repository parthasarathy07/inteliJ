package com.java.oops.instanceAndStaticBlock.StaticInTwoClass;

public class Base {
    static {
        System.out.println("It is base static");
    }
    public static void main(String[] args) {
        System.out.println("base main");
        int i= Child.i;
        int k=Child.i;
    }
}
