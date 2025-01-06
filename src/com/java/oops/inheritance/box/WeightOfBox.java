package com.java.oops.inheritance.box;
public class WeightOfBox extends Box {
    int weight;
    WeightOfBox(){
        super();//it call the not paremeterized constructor in Box
        this.weight=1;
    }
    WeightOfBox(int l, int b, int w, int weight){
        super(l,b,w);
        this.weight=weight;
    }
}
