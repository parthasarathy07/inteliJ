package com.java.advanced.multiThreading;
class Book extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("writing book "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Note implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("writing note "+ i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadUsingClass{
    public static void main(String[] args) {
        SimpleClass s1=new SimpleClass();

        Thread T2=new Thread(()->{ try {
            s1.display();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }});

        T2.start();
        try{
            T2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        Book B1=new Book();
        B1.start();

        Note n1=new Note();
        Thread t1=new Thread(n1);
        t1.start();

        System.out.println("The program is ended");
    }
}

class SimpleClass{
    void display() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("code is running "+i);
            Thread.sleep(1000);
        }
    }
}