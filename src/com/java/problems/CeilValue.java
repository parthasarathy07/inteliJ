package com.java.problems;
import java.util.Scanner;

public class CeilValue {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int start=0,mid=0;
        int end=arr.length-1;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(start);
    }
}
