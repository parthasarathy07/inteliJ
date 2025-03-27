package com.java.oops.instanceAndStaticBlock;

public class Static1 {
    static int i=30;

    static {
        m1();
        System.out.println("static block");
        System.out.println(i);
        Static1 sc=new Static1();
        System.out.println(sc.k);
    }
    int k=20;
    public static void main(String[] args) {
        m1();
    }
    private static void m1() {
        System.out.println("m1 method");
        System.out.println(j);
    }
    static int j=67;
}
