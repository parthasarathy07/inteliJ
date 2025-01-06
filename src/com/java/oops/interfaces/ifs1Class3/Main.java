package com.java.oops.interfaces.ifs1Class3;
import com.java.oops.interfaces.*;

public class Main{
    public static void main(String[] args) {
        NiceCar rockPower =new NiceCar();
        Engine ob1=rockPower.getEngine();
        MusicPlayer ob2=rockPower.getPlayer();
        ob1.start();
        ob1.stop();
        rockPower.engineStart();
        rockPower.enginesStop();

        System.out.println();

        ob2.start();
        ob2.stop();
        rockPower.MusicStart();
        rockPower.MusicStop();

        System.out.println();

        NiceCar turbo= new NiceCar(new TurboEngine(),new RockMusic());
        turbo.engineStart();
        turbo.enginesStop();
        turbo.MusicStart();
        turbo.MusicStop();

        System.out.println();
        turbo.upgradeMusic(new ClassicMusic());
        turbo.MusicStart();
    }
}