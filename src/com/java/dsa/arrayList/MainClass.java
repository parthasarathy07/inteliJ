package com.java.dsa.arrayList;

public class MainClass {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(20);
        list.add(2);
        System.out.println(list.len());
        list.add(7);
        list.add(3);
        list.pop();
        list.remove(0);
        System.out.println(list.toString());
        MainClass classes=new MainClass();
        System.out.println(classes.toString());

        CustomGenericArrayList<String> list1 = new CustomGenericArrayList<>(20);
        list1.add("king");
        System.out.println(list1.len());
        list1.add("queen");
        list1.add("rook");
        list1.pop();
        list1.remove(0);
        System.out.println(list1.toString());
    }
}
