package com.java.advanced.collectionsFramework;

import java.util.*;
import java.util.concurrent.BlockingDeque;

public class AllCollection {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        for(int i = 0;i<10;i++) {
            stack.push((Integer) i);
            System.out.println(stack.peek());
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        TreeMap<Integer,Integer>hashMap=new TreeMap<>();

        PriorityQueue<Integer>queue=new PriorityQueue<>();
        ArrayDeque<Integer>arrayDeque=new ArrayDeque<>();
        Deque deque=new ArrayDeque();

    }
}
