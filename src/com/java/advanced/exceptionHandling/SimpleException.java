package com.java.advanced.exceptionHandling;

import java.io.IOException;

public class SimpleException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            div(a,b);
        }catch (ArithmeticException | IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("It is always running");
        }
    }
    static void div(int a, int b) throws ArithmeticException, IOException {
        if(b==0){
            throw new ArithmeticException("there is an arithmetic error");
        }
        if(b==1){
            throw new IOException("there is an io error");
        }
        System.out.println(a/b);
    }
}
