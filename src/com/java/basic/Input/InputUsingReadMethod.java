package com.java.basic.Input;

import java.io.IOException;
public class InputUsingReadMethod {
    public static void main(String[] args) throws IOException {
        System.out.println("enter length");
        int num= (System.in.read())-'0';
        System.out.println("num is "+num);
    }
}
