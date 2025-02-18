package com.java.basic.string__builder;

import java.util.HashMap;
import java.util.HashSet;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder();
        System.out.println(s); //also we can also write new StringBuilder("king");
        s.append("k");
        s.append("i");
        s.append("n");
        s.append("g");
        System.out.println(s);
        System.out.println(s.toString());
    }
}
