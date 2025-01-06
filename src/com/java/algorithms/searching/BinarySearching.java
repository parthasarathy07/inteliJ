package com.java.algorithms.searching;

import java.util.Arrays;

public class BinarySearching {
    public static void main(String[] args) {
        int [] arr={4,54,32,2,4,-1,43,23,45};
        int target=23;
        System.out.println("the value is"+searching(arr,target));
    }
    static int searching(int []arr,int target){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start=0,end=arr.length,mid;

        while(end>=start){
            mid =start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
