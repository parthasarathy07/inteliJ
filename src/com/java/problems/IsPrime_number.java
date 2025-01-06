package com.java.problems;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class IsPrime_number
    {


           public  boolean prime(int v)
            {
                if(v<=1)
                    {
                        return false;
                    }
                if(v==2||v==3)
                    {
                        return true;
                    }
                if(v%2==0||v%3==0)
                    {
                        return false;
                    }
                for(int j=5;j<=sqrt(v);j=j+6)
                    {
                        if(v%j==0||v%(j+2)==0)
                            {
                                return false;
                            }

                    }
                return true;
            }
        public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                IsPrime_number obj = new IsPrime_number();
                System.out.println(obj.prime(n));
            }
    }
