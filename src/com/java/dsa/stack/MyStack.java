package com.java.dsa.stack;

public class MyStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head,temp;
    void add(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=temp=newNode;
        }else{
            temp.next=newNode;
            temp=temp.next;
        }
    }
}
