package com.java.oops.objectcloning;

public class ShallowCopy implements Cloneable {
    int value1;
    int[] arr;
    ShallowCopy(int value1,int[]arr){
        this.value1=value1;
        this.arr=arr;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
