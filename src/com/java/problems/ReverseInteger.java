package com.java.problems;

public class ReverseInteger {
    public static void main(String []args){
        int i=200;
        StringBuffer s=new StringBuffer();
        while(i!=0){
            s.append(i % 10);
            i/=10;
        }
        System.out.println(s);
    }
}
