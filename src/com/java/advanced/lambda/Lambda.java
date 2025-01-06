package com.java.advanced.lambda;

public class Lambda {
    public static void main(String[] args) {
        Operations sum=(int a,int b)->(a+b);
        Operations multi=(int a,int b)->(a*b);
        System.out.println("add value -> " +  sum.operation(2,3));
        System.out.println("multi value -> "+ multi.operation(2,3));
        System.out.println("add value -> " +  calculate(2,3,sum));
        System.out.println("multi value -> "+ calculate(2,3,multi));
    }

    static int calculate(int a,int b,Operations op){
        return op.operation(a,b);
    }

    interface Operations{
        int operation(int value1,int value2);
    }
}
