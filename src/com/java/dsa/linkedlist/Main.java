package com.java.dsa.linkedlist;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Inserting insert=new Inserting();
        insert.insertAtBeginning(1);
        insert.insertAtBeginning(2);
        insert.insertAtBeginning(3);
        insert.insertAtEnd(0);
        insert.insertAtEnd(1);
        insert.insertAtEnd(2);
        insert.insertAtEnd(3);
        insert.display();
    }
}
