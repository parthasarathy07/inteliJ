package com.java.basic;

public class Shadowing
    {
        static int x=100;
        public static void main(String[]args)
            {
                System.out.println(x);
                int x=30;
                System.out.println(x);
                {
                    System.out.println(x);
                }
                fun();
            }
        static void fun()
            {
                System.out.println(x);
                {
                    int x=20;
                    System.out.println(x);
                }
                System.out.println(x);
                int x=50;
                System.out.println(x);
            }
    }
