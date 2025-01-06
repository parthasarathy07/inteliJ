package com.java.oops.abstracting;

public class Main {
    public static void main(String[] args) {
        Daughter daughter=new Daughter(96);
        Son son =new Son(94);

        daughter.name();
        daughter.age();
        daughter.career();
        System.out.println();

        son.name();
        son.age();
        son.career();
    }
}
