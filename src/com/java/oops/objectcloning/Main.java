package com.java.oops.objectcloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy human1=new ShallowCopy(1,new int[]{1,2,3,4,5});
        ShallowCopy human2=(ShallowCopy) human1.clone();
        System.out.println(Arrays.toString(human2.arr));
    }
}
