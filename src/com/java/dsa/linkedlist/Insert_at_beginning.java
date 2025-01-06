package com.java.dsa.linkedlist;

import java.util.Scanner;

class List_of_node {
    Node head,temp;
     static class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
             next=null;
         }

    }
     void insert(int data){
         Node newnode=new Node(data);
         if(head==null){
             head=newnode;
         }
         else {
             temp=head;
             while(temp.next!=null){
                 temp=temp.next;
             }
             temp.next=newnode;
         }

     }
     void display(){
         temp=head;
         while (temp!=null){
             System.out.println(temp.data);
             temp=temp.next;
         }
     }

}
public class Insert_at_beginning {
    public static void main(String []args){
        List_of_node list =new List_of_node();
        Scanner in = new Scanner(System.in);
        while(true){
            String val=in.next();
            if(val.equals("stop"))
                break;
            int val1=Integer.parseInt(val);
            list.insert(val1);
        }

        list.display();

    }
}
