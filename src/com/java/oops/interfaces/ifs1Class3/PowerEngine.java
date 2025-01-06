package com.java.oops.interfaces.ifs1Class3;
import com.java.oops.interfaces.*;
public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine is started");
    }

    @Override
    public void stop() {
        System.out.println("power engine is stopped");
    }

    @Override
    public void acc() {
        System.out.println(" power engine is  powerful");
    }
}
