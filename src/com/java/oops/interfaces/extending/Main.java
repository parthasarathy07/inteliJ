package com.java.oops.interfaces.extending;

public class Main implements B {
    @Override
    public void newFun() {
        System.out.println("new fun");
    }
//    @Override
//    public void fun() {
//        System.out.println("only fun");
//    }

    public static void main(String[] args) {
        A ob1=new Main();
        ob1.fun();
//        ob1.newFun();  // parent not knows what is in the child
        B ob=new Main(); //child knows what is in the parent
        ob.fun();
        ob.newFun();
    }
}
