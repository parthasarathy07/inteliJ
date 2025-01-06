package com.java.basic.nptl.pk1;
class Question {
    int i;
    public Question(int i) {
        System.out.println(i);
        this.i = ++i;
        System.out.println(i);
    }
}
class Question1 extends Question {
    public Question1(int j) {
        super(++j);
        System.out.println(j);
    }
}
public class Check {
    public static void main(String[] args) {
        Question1 n = new Question1(20);
    }
}
