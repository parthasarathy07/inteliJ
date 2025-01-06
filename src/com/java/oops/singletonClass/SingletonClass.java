package com.java.oops.singletonClass;

public class SingletonClass {
    int roll =1;
    String name="Parthasarathy";
    void display(){
        System.out.println("the roll is "+ roll);
        System.out.println("the name is "+ name);
    }
    private SingletonClass(){};                    //Private constructor
    static SingletonClass ob;
    static SingletonClass create(){
        if(ob==null){
            SingletonClass.ob=new SingletonClass();
            return ob;
        }
        return  ob;
    }
}
class Main{
    public static void main(String[] args) {
        SingletonClass ob =SingletonClass.create();
        SingletonClass ob1=SingletonClass.create();
        System.out.println(ob.equals(ob1));
        ob.display();
        ob1.display();
    }
}
