package com.java.problems;
import java.util.Scanner;

public class Fibbonoc
    {
        public static void main(String[]args)
            {
                int p=0,c=1;
                Scanner obj = new Scanner(System.in);
                int n = obj.nextInt();
                for (int i = 2; i <= n; i++)
                    {
                        System.out.print(" "+p);
                        int temp=p+c;
                        p=c;
                        c=temp;
                    }
            }
    }
