package com.java.basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Array.get(arr,0));
        Array.set(arr,2,'7');
        System.out.println(Arrays.toString(arr));
    }
}
