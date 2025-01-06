package com.java.basic;
import java.util.Scanner;
public class Check_obj_equal
    {
        String a;

    }
class Obj_creation
    {
        public static void main(String[]args)
            {
                Check_obj_equal c=new Check_obj_equal();
                Check_obj_equal b=new Check_obj_equal();
                Scanner obj = new Scanner(System.in);
                c.a=obj.nextLine().trim();
                b.a=obj.nextLine().trim();
//                System.out.println(c.a==b.a);      // output false
                System.out.println(b.a.equals(c.a)); // output true
            }
    }