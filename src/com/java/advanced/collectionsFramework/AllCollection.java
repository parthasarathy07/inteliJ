package com.java.advanced.collectionsFramework;

import java.util.*;

public class AllCollection {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        for(int i = 0;i<10;i++) {
            stack.push(i);
            System.out.println(stack.peek());
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        TreeMap<Integer,Integer>hashMap=new TreeMap<>();


    }
}
