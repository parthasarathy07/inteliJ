package com.java.oops.static__InnerClass;

public class OuterClassStatic {
    int age;
    String s;
    static class InnerClass{
        int roll;
        static String name;
        InnerClass(int roll,String name){
            this.roll=roll;
            InnerClass.name=name;
        }
    }

    public static void main(String[] args) {
        InnerClass ob=new InnerClass(1,"alone");
        System.out.println("the name is --"+InnerClass.name+" and the roll is--"+ob.roll);
        InnerClass ob1=new InnerClass(2,"queen");
        InnerClass.name="queen";
        System.out.println("the name is --"+InnerClass.name+" and the roll is--"+ob1.roll);
    }
}
