package com.java.basic.string;

import java.util.regex.Pattern;

public class StringRegEx {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".*\\bhello\\b.*","hello world"));
        System.out.println(Pattern.matches("a*","ab"));
        System.out.println(Pattern.matches("a*",""));
        System.out.println(Pattern.matches("\\d{1,2}-\\d{1,2}-\\d{4}","20-11-2004"));
    }
}
