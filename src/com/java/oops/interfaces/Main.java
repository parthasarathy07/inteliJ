package com.java.oops.interfaces;

public class Main implements Brake,Engine,Light {
    @Override
    public void running() {
        System.out.println("light is running");
    }
    @Override
    public void start() {
        System.out.println("Car is started");
    }


    @Override
    public void stop() {
        System.out.println("car is stopped");
    }

    @Override
    public void acc() {
        System.out.println("car is accelerated");
    }

    @Override
    public void brake() {
        System.out.println("car on hand brake");
    }

    public static void main(String[] args) {

        Main ob= new Main();
        ob.acc();
        ob.running();
        ob.stop();
        ob.start();
        ob.brake();
        Brake brake=new Main();
        brake.start();
        brake.brake();
        System.out.println(Engine.i);
    }
}
