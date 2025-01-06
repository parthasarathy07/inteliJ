package com.java.basic.array;

import java.util.Arrays;

class Arr{
    int size;
    int []arr;
    Arr(int size){
        this.size=size;
       arr =new int[this.size];
    }

    void display(){
        System.out.println(Arrays.toString(arr));
    }
}
public class InitializeAtRunTime {
    public static void main(String[] args) {
        Arr ob=new Arr(10);
        ob.arr[0]=2;
        ob.arr[2]=3;
        System.out.println(ob.arr.length);
        ob.display();
    }
}
