package com.java.dsa.linkedlist.myLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String > list=new MyLinkedList<>();
        list.add("king");
        list.add("queen");
        list.add("jack");
        list.insertAtBeginning("ace");
        list.display();
        list.insert(2,"nothing");
        list.display();
        list.delete("nothing");
        list.display();
        list.recPrint();
    }
}
