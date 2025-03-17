package com.java.basic.methods;

public class IntegerMain {
    public static void main(String[] args) {
        Integer i=1;
        int i1=i;
        Integer i2=i1;
        Integer i3=1;
        System.out.println(i.getClass()+" "+i);
        System.out.println((i==i2)+" "+(i==i1)+" "+(i3==i));
        System.out.println(i+i1);
        System.out.println(Integer.reverse(123));
        System.out.println(Integer.valueOf(3)==Integer.valueOf(3));
        System.out.println(Integer.bitCount(4));
        System.out.println(Integer.compare(3,2));
    }
}
