package com.java.problems.patters;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n*2-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==j||j==c-i+1){
                    System.out.print("*");
                }else if (j > i && j < c-i + 1) {
                    System.out.print("i");
                }else {
                    System.out.print('b');
                }
            }
            System.out.println();
        }
    }
}
