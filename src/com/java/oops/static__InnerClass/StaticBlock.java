package com.java.oops.static__InnerClass;

public class StaticBlock {
    int c;
    static   int a=0;
    static  int b;

    StaticBlock(){
        this.c=1;
        System.out.println("This is constructor and the value of c is "+this.c);
    }

    static{
        System.out.println("it is in static block");
        b=a+2383;
    }

}
class Main{
    public static void main(String[] args) {
        StaticBlock ob=new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}