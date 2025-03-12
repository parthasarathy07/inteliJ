package com.java.dsa.arrayList;

public class CustomArrayList {

    private int size;
    private int index=0;
    private int [] arr;
    CustomArrayList(){
        this.size=10;
        arr=new int[size];
    }
    CustomArrayList(int sizeOfList){
        size=sizeOfList;
        arr=new int[size];
    }
    public void add(int element){
        arr[index]=element;
        index++;
    }
    public int len(){
        return index;
    }
    public void pop(){
        index--;
    }
    public void remove (int indexValue){
        for(int i=indexValue;i<index-1;i++){
            arr[i]=arr[i+1];
        }
        index--;
    }
    private String display(){
        String s="";
        for(int i=0;i<index;i++){
            s +=arr[i];
        }
        System.out.println();
        return  "[" +s+"]";
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + len() +
                ", index=" + index +
                ", arr=" + display() +
                '}';
    }
}
