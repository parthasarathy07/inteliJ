package com.java.advanced.generics;

public class GenericPrinter <TypeOfDataType>{

    private final TypeOfDataType val;
    GenericPrinter(TypeOfDataType val){
        this.val=val;
    }

    private Object val1;
    void createObjectForObjectClass(){
        this.val1= new Object();
    }
    private TypeOfDataType val3;
    @SuppressWarnings("unchecked")
    void createObjectForTClass(){
        this.val3=(TypeOfDataType) new Object();
    }

    void display(){
        System.out.println(val);
        System.out.println(val1);
        System.out.println(val3);
    }
}
