package com.java.oops;

public class AnonymousClass {
void show(){
}
}

class Main{
    public static void main(String[] args) {
        AnonymousClass ob=new AnonymousClass(){
            void show(){
                System.out.println("only king");
            }
        };
        ob.show();
    }
}
