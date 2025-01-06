package com.java.advanced.exceptionHandling;

import java.util.Scanner;

public class TestMyException {
    public static void main(String[] args) {
        try{
            Scanner ob =new Scanner(System.in);
            if(ob.nextLine().equals("alone")){
                throw new MyException("error name is alone");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
