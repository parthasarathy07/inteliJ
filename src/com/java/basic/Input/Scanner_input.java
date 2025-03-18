package com.java.basic.Input;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {
//        Scanner ob=new Scanner(System.in);
//        String s=ob.nextLine().trim();
//        char c=ob.nextLine().trim().charAt(4);
//        System.out.println(s+" "+c);
        Scanner sc=new Scanner(System.in);
//        while(sc.hasNextInt()){
//            System.out.println("value is "+sc.nextInt());
//        }
//         System.out.println(sc.next("\\d*"));
//        System.out.println(sc.nextBigInteger(2));
//        sc.useRadix(2);
        int i=(sc.nextInt());
        System.out.println(Integer.toString(i,2));
        sc.reset();
//        sc.skip("\\D+");
//        sc.useDelimiter("\\D+");
//        while (sc.hasNextInt()) {
//            System.out.print(sc.nextInt()+" ");
//        }
    }
}
