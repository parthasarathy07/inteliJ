package com.java.problems;

import java.util.Scanner;

public class Common_Prefix {
    public static void main(String[] args) {
        Prefix obj=new Prefix();
        Scanner in= new Scanner(System.in);
        String[]s = new String[3];
       for (int i = 0;i<3; i++){
           s[i]=in.next();
       }
      System.out.println(obj.longestCommonPrefix(s));
    }
}
class Prefix {
    public String longestCommonPrefix(String[] strs) {
        char[][]arr=new char[200][];
        for(int i=0;i<strs.length;i++){
            arr[i]=strs[i].toCharArray();
        }
        String s ="";
        if(strs.length==1)
            return strs[0];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<strs.length-1;j++){
                if(i==arr[j+1].length)
                    return s;
                if(arr[j][i]!=arr[j+1][i]){
                    return s;
                }
            }
            s +=arr[0][i];
        }
        return s;
    }
}