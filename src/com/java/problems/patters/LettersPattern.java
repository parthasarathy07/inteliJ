package com.java.problems.patters;

import java.util.Scanner;

public class LettersPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(k%2==0){
                    System.out.print((char)((k)+65)+" ");
                }else{
                    System.out.print((char)((k)+97)+" ");
                }
                k++;
            }
            System.out.println();
        }
    }
}
