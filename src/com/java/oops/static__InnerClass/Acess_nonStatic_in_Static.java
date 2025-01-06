package com.java.oops.static__InnerClass;

public class Acess_nonStatic_in_Static {
    public static void main(String[] args) {
       Acess_nonStatic_in_Static obj =func();
       obj.fun();
    }
    static Acess_nonStatic_in_Static func(){
        System.out.println("This is static method");
        Acess_nonStatic_in_Static ob=new Acess_nonStatic_in_Static();
        return ob;
    }
    void fun(){
        System.out.println("This is non static method");
    }
}
