package com.java.dsa.linkedlist;

import java.util.Scanner;

class Linkedlist {
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
             head=temp=newnode;
         }
         else {
             temp=temp.next=newnode;
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


public class InsertUsingUserInput {
    public static void main(String []args){
        Linkedlist list =new Linkedlist();
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
