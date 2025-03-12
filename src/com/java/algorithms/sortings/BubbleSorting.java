package com.java.algorithms.sortings;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int []arr={2,32,1,3,24,3,554,4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
