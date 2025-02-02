package com.java.problems;
import java.util.*;
public class LinearConvolution {
        public static int[] convolution(int[] x, int[] h) {
            int[]result=new int[x.length+h.length-1];
            for(int i=0;i<x.length;i++){
                for (int j = 0; j < h.length; j++) {
                    result[i+j]+=x[i]*h[j];
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] x = {1,2,1,1};
            int[] h = {1,-1,1,1};
            int[] result = convolution(x, h);
            System.out.print("Convolution Result: ");
            System.out.print(Arrays.toString(result));
        }

}
