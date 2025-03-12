package com.java.advanced.recurssion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void rev(int[] arr, int i, int j) {
        if(i>=j) return;
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        rev(arr,i+1,j-1);
    }

}
