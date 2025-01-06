package com.java.oops.constructors;
class OverLoading{
    int a,b;
    OverLoading(){
        System.out.println("This is default");
    }
    OverLoading(int a,int b){
        System.out.println("The values are "+a+" "+b);
    }
}
public class Constructor_overloading {
    public static void main(String[] args) {
        OverLoading ob1=new OverLoading();
        OverLoading ob2=new OverLoading(2,3);
    }
}
