package com.java.algorithms.searching;

import java.util.Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr={-1,0,23,43,54,75,90};
        int target=23;
        System.out.println("the "+target+" in index is "+searching(arr,target));
        int []arr1={90,80,40,20,10,0,-10};
        target=80;
        System.out.println("the "+target+" in index is "+searching(arr1,target));
    }

    static int searching(int []arr,int target){
        System.out.println(Arrays.toString(arr));
        int start=0,end=arr.length-1,mid;
        boolean isAsec=arr[end]>arr[start];
        while(end>=start){
            mid =start+(end-start)/2;
            if(arr[mid]==target)
                return mid;

            if(isAsec){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
            }else {
                if(arr[mid]<target){
                    end=mid-1;
                }
                else if(arr[mid]>target){
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
