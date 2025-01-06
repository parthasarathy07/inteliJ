package com.java.oops.static__InnerClass;

public class Local_InnerClass {
    static void method(){
        System.out.println("it is outer class");
        class Local{
            void printing(){
                System.out.println("it is inner class");
            }
        }
        Local ob=new Local();
        ob.printing();
    }
    public static void main(String [] args){
        method();
    }
}
