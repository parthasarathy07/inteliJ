package com.java.basic.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_basic {
    public static void main(String[]args){
        ArrayList<Integer> list =new ArrayList<Integer>(2);
        Scanner in = new Scanner(System.in);
        for (int i=0;i<4;i++) {
            list.add(in.nextInt());
        }
        System.out.printf("%s",list);
        System.out.println(list.getFirst());
    }
}
