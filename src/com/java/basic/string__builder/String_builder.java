package com.java.basic.string__builder;


public class String_builder {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder();
        System.out.println(s); //also we can also write new StringBuilder("king");
        s.append("k");
        s.append("i");
        s.append("n");
        s.append("g");
        s.insert(2, (String) null);
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s.capacity());
        s.trimToSize();
        System.out.println(s.capacity());
        s.append("er");
        s.setLength(3);
        System.out.println(s.capacity());
        System.out.println(s);
        System.out.println(s.repeat("3",4));
    }
}
