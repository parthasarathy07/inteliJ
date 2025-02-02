package com.java.problems;

import java.util.Arrays;

public class CircularConvolution {
    static int[] calculate(int[]x,int[]y){
        int[]result=new int[Math.max(x.length, y.length)];
        int k=1,l=1;
        for (int i=0;i<x.length;i++) {
            for (int value : y) {
                k--;
                result[i] += x[k] * value;
                if (k == 0) {
                    k = x.length;
                }
            }
            k=++l;

        }
        return result;
    }
    public static void main(String[] args) {
        int[]x={1,-1,-2,3,-1};
        int[]y={1,2,3};
        System.out.print("the circular convolution result is ");
        System.out.println(Arrays.toString(calculate((x.length>y.length)?x:y,(x.length<y.length)?x:y)));
    }
}
