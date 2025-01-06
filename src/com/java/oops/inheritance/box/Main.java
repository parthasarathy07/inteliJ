package com.java.oops.inheritance.box;

public class Main {
    public static void main(String[] args) {
        WeightOfBox ob=new WeightOfBox();
        WeightOfBox ob1=new WeightOfBox(2,3,4,5);
        System.out.println(ob.l+""+ob.b+ob.w+ob.weight);
        System.out.println(ob1.l+""+ob1.b+ob1.w+ob1.weight);

//        Box ob2=new WeightOfBox();  //parent class can refer child class but cannot access the child class properties
//        System.out.println(ob2.l+""+ob2.b+ob2.w+ob2.weight);   //ob2.weight cannot be used
//        WeightOfBox ob3=new Box();    //sub class cannot refer parent class object

    }
}
