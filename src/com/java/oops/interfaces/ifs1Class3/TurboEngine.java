package com.java.oops.interfaces.ifs1Class3;
import com.java.oops.interfaces.Engine;

public class TurboEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Turbo engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Turbo engine is stopped");
    }

    @Override
    public void acc() {
        System.out.println("Turbo engine is powerful");
    }
}
