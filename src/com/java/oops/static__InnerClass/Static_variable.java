package com.java.oops.static__InnerClass;
class Human{
    int age;
    String name;
    static int population;
    Human(int age,String name){
        this.age=age;
        this.name=name;
        Human.population+=1;
    }
}

public class Static_variable {
    public static void main(String[] args) {
        Human alone=new Human(19,"alone");
        System.out.println(Human.population);
        Human king =new Human(20,"king");
        System.out.println(Human.population);
    }
}
