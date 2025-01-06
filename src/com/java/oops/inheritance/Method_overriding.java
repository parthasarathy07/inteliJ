package com.java.oops.inheritance;
class Base1{
    void show(){
        System.out.println("this method in base class");
    }
}
class Sub11 extends Base1{
    @Override
    void show(){
        super.show();
        System.out.println("this method in sub class");
    }
}
public class Method_overriding {
    public static void main(String[] args){
        Base1 ob=new Base1();
        Sub11 ob1=new Sub11();
        System.out.println(ob);
        ob.show();
        ob1.show();
    }
}
