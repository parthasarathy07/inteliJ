package com.java.problems;

public class Counting_occurrences
    {
        public static void main(String[]args)
            {

                byte count =0;
                long n=1323287653;
                int find=3,rem;
                while(n>0)
                    {
                        rem= (int) (n%10);
                        if(rem==find)
                            count++;
                        n=n/10;
                    }
                System.out.println(count);
            }

    }
