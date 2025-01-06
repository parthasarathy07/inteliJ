package com.java.problems;
import java.util.Scanner;
public class CountPrimes
    {
      public static void main(String[]args)
       {
         Scanner in =new Scanner(System.in);
         int n = in.nextInt();
         System.out.println(Sol.counting(n));
       }
    }

 class Sol
 {
    static int counting(int n)
     {
       IsPrime_number obj= new IsPrime_number();
       int x=0;
       int count=0;
      while(x<=n)
       {
         if(obj.prime(x))
         {
          count++;
         }
          x++;
       }
       return count;
   }
 }
