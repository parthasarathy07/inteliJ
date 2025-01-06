package com.java.advanced.collectionsFramework;

public class CustomGenericArrayList<T>{

    private final int size;
    private int index=0;
    private final T [] arr;
    @SuppressWarnings("unchecked")
    CustomGenericArrayList(){
        this.size=10;
        arr=(T[])new Object[size];
    }

    @SuppressWarnings("unchecked")
    CustomGenericArrayList(int sizeOfList){
        size=sizeOfList;
        arr=(T[])new Object[size];
    }
    public void add(T element){
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
        StringBuilder s= new StringBuilder();
        for(int i=0;i<index;i++){
            s.append(arr[i]);
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
