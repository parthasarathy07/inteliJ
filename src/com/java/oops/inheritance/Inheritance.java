package com.java.oops.inheritance;

class Base {
    int a = 1, b = 2, c, d, x, y;

    Base() {
        System.out.println("this is super class");
    }
    Base(int i,int j){
        this();
    }
    void getData(int c, int d) {
        this.c = c;
        this.d = d;
    }
}

class Sub1 extends Base {
    //there is default super()
    Sub1() {
        System.out.println("this is sub1 class");
    }

    public void add() {
        x = a + b;
    }
}

class Sub2 extends Sub1 {
    //there is default super()
    Sub2() {
        System.out.println("this is sub2 class");
    }

    void display() {
        System.out.printf("%d %d %d", x, c, d);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Sub2 ob = new Sub2();
        ob.add();
        ob.getData(3, 4);
        ob.display();
    }
}
