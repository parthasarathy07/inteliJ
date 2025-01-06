package com.java.basic.string;

public class Check_string_equal
    {
        public static void main(String[] args)
            {
                String a="king";//here k is small
                String b="king";//here k is small
                String e="King";//here K is caps
                int c=20;
                int d=c;
                char f='a';
                char g='a';
                System.out.println(b==a);//points same object
                System.out.println(a.equals(b));//both contents are same
                System.out.println(a==e);//case sensitive cause making different objects
                System.out.println(a.equals(e));
                System.out.println(c==d);//both point same object
                System.out.println(f==g);
                //we cannot compare char


            }
    }
