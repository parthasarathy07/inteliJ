package com.java.advanced.collectionsFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_basic {
    public static void main(String[]args){
        ArrayList<Integer> list =new ArrayList<Integer>(2);
        Scanner in = new Scanner(System.in);
        for (int i=0;i<4;i++) {
            list.add(in.nextInt());
        }
        System.out.printf("%s \n",list);
        System.out.println(list.getFirst());
        System.out.println();
        list.remove(Integer.valueOf(3));
        System.out.println(list);

    }
}
