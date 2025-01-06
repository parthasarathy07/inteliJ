package com.java.basic.array;
public class Basic_2D_array {
    public static void main(String[]args){

        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] row:arr){
            for(int clm:row)
            {
                System.out.print(clm);
            }
            System.out.println();
        }

    }


}
