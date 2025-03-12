package com.java.advanced.recurssion;

public class MaxInArray {
    public static void main(String[] args) {
        int[]arr={1,3,4,45,6,34,3,5,6};
        System.out.println(max(arr,0,0));
    }
    private static int max(int[]arr,int i,int max){
        if(i==arr.length-1) return arr[i];
        return Math.max(max(arr,i+1,max),arr[i]);
    }

}
