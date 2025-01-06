package com.java.oops.inheritance.box;

public class Box {
    int l,b,w;
    Box(){
        this.l=1;
        this.b=1;
        this.w=1;
    }
    Box(int l,int b,int w){
        this.l=l;
        this.b=b;
        this.w=w;
    }
    Box(Box instance){
        this.l=instance.l;
        this.b=instance.b;
        this.w=instance.w;
    }
}
