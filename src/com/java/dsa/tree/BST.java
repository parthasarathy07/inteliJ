package com.java.dsa.tree;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    void insert(int val){
       root= insertRec(root,val);
    }
    Node insertRec(Node root,int data){
        if(root==null) {
            return new Node(data);
        }else if(data<root.data){
            root.left= insertRec(root.left,data);
        } else if (data > root.data) {
            root.right= insertRec(root.right,data);
        }
        return root;
    }
    void display(){
        displayRec(root);
    }

    void displayRec(Node root) {
        if(root!=null){
            displayRec(root.left);
            System.out.print(root.data+" ");
            displayRec(root.right);
        }

    }

}
