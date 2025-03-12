package com.java.basic.string;

import java.util.regex.Pattern;

public class StringRegEx {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".*\\bhello\\b.*","hello world"));
        System.out.println();
    }
}
