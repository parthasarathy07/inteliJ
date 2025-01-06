package com.java.algorithms.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={2,4,5,78,9,0,67,43,434,6,5,-34,34,-32};
        int target=67;
        System.out.println(searching(arr,target));
    }
    static int searching(int []arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
