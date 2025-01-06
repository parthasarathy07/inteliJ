package com.java.advanced.multiThreading;

public class SynchronizedClass {
    synchronized void printing(int n) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(" value is "+ i*n);
            Thread.sleep(2000);
        }
    }
}
class Main{
    public static void main(String[] args) {
        SynchronizedClass s1=new SynchronizedClass();
        Thread t1=new Thread(()->{
            try {
                s1.printing(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        Thread t2=new Thread(()->{
            try {
                s1.printing(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();
    }
}
