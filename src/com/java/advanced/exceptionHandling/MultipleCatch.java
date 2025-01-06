package com.java.advanced.exceptionHandling;

import java.io.IOException;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            SimpleException.div(6,0);
            throw new IOException("io error");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch( IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("program executed ");
        }

    }
}
