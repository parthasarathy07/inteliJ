package com.java.basic.string__builder;

public class SeriesOfAlphabets {
    public static void main(String[] args) {
        char ch='a';
        StringBuilder s=new StringBuilder();
        for (int i = 0; i <26; i++) {
            s.append((char)(ch+i));
        }
        System.out.println(s);
    }
}
