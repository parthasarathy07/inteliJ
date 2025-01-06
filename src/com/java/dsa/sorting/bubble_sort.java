package com.java.dsa.sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr={5,3,1,6,7,8,4};
        for(int i=0;i< arr.length;i++){
            int k=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    k=1;
                }
            }
            if(k==0)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
