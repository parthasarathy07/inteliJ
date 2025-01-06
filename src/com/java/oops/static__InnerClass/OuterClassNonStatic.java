package com.java.oops.static__InnerClass;

public class OuterClassNonStatic {
    class Innerclass{
        int roll;
        String name;
        Innerclass(int roll,String name){
            this.roll=roll;
            this.name=name;
        }
    }

    public static void main(String[] args) {
        OuterClassNonStatic ob1=new OuterClassNonStatic();
        OuterClassNonStatic.Innerclass ob= ob1.new Innerclass(1,"alone");
        System.out.println(ob.name);
        System.out.println(ob.roll);
    }
}
