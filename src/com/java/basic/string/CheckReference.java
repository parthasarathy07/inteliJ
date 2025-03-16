package com.java.basic.string;

public class CheckReference {
    public static void main(String[] args) {
        String s="king";
        System.out.println( s.concat("fe")==(s));
        System.out.println(s.toUpperCase()==(s));
        System.out.println(s.replace('i','j')==(s));
        System.out.println(String.valueOf(s)==(s));
    }
}
