package com.java.dsa.linkedlist;

public class Inserting {
    private Node head,tail;
     private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void insertAtBeginning(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(tail==null) {
            insertAtBeginning(data);
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
