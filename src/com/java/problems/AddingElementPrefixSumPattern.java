package com.java.problems;

import java.util.Arrays;
import java.util.Scanner;
/*
input [1 2 3 4 5]
ans[0]=1 -(2+3+4+5)
ans[1]=1+2-(3+4+5)
ans[2]=1+2+3-(4+5)
ans[3]=1+2+3+4-(5)
ans[4]=1+2+3+4+5
output ans =[13, 9, 3, 5, 15]
*/

public class AddingElementPrefixSumPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum +=arr[i];
        }
        /*
        brute force
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                    ans[i] +=arr[j];
                }else{
                    ans[i] -=arr[j];
                }
            }
            ans[i]=Math.abs(ans[i]);
        }
        */
        int pref=0;
        for(int i=0;i<n;i++){
            pref +=arr[i];
            arr[i]=Math.abs(sum-(2*pref));
        }
        System.out.println(Arrays.toString(arr));
    }
}
