package com.java.dsa.linkedlist.myLinkedList;

public class MyLinkedList <T> {
    int size=0;
    private Node<T> head,temp;

    static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data=data;
        }
    }

    void add(T val){
        Node<T> newNode=new Node<>(val);
        if(head==null){
            head=temp=newNode;

        }else{
            temp.next=newNode;
            temp=newNode;
        }
        size++;
    }
    void insertAtBeginning(T val){
        Node<T> newNode=new Node<>(val);
        if(head==null){
            head=temp=newNode;
        }else {
            Node<T> tem=head;
            head=newNode;
            newNode.next=tem;
        }
        size++;
    }
    void display(){
        Node<T> tem=head;
        if(head==null){
            System.out.println("empty!!!");
        }
        System.out.print("[ ");
        while (tem!=null){
            System.out.print(tem.data+"  ");
            tem=tem.next;
        }
        System.out.println("]");
    }


    void insert(int index,T val){
        if(head==null||index==0){
            insertAtBeginning(val);
        }
        else {
            Node<T>newNode=new Node<>(val);
            Node<T> tem=head;
            if(index>=size){
                System.out.println("index out of bounce");
            }else {
                for(int i=0;i<index-1;i++){
                    tem=tem.next;
                }
                Node<T> tem1=tem.next;
                tem.next=newNode;
                newNode.next=tem1;
            }
        }
    }

    void delete(T val){
        Node<T>tem=head;
        if(tem.data.equals(val)){
            head=head.next;
            return;
        }
        while (tem.next!=null){
            if(tem.next.data.equals(val)){
                tem.next=tem.next.next;
                return;
            }
            tem=tem.next;
        }
        System.out.println("no element to delete");
    }

    void recPrint(){
        recPrint(head);
    }
    void recPrint(Node<T> tem){
        if(tem.next==null){
            System.out.print(tem.data+" ");
            return;
        }
        recPrint(tem.next);
        System.out.print(tem.data+" ");
    }

}
