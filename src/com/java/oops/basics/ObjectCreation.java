package com.java.oops.basics;

class Template{
    int roll;
    String name;
    int marks=92;
    protected void display(){
        System.out.println("the name is "+name );
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        Template ob =new Template();
        System.out.println(ob.marks);
        ob.marks=32;
        System.out.println(ob.getClass());
        System.out.println(ob);
        System.out.println(ob.roll);
        System.out.println(ob.name);
        System.out.println(ob.marks);
        ob.name="alone";
        ob.display();

    }

}

