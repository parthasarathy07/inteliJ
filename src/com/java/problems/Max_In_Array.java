package com.java.problems;

import java.util.Scanner;

public class Max_In_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] array= new int[20];
        for(int i=0;i<10;i++){
            array[i]=in.nextInt();
        }
        if(array.length==0) {
            System.out.println("Array is empty");
            return;
        }
       System.out.println("The max value is "+max(array));
    }
    static int max(int [] arr){
        int maxx=0;
        for (int j : arr) {
            if (maxx < j)
                maxx = j;
        }
        return maxx;
    }
}
