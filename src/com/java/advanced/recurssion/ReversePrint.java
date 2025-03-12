package com.java.advanced.recurssion;

public class ReversePrint {
    public static void main(String[] args) {
     revPrint(10,1);
    }
    static void revPrint(int end,int initial){
        if(end==initial){
            System.out.print(initial+" ");
            return;
        }
        revPrint(end,initial+1);
        System.out.print(initial+" ");
    }
}
