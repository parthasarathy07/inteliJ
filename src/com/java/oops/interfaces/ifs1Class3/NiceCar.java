package com.java.oops.interfaces.ifs1Class3;
import com.java.oops.interfaces.*;
public class NiceCar {
    private  Engine engine;
    private  MusicPlayer player;

    public NiceCar(){
        this.engine=new PowerEngine();
        this.player=new RockMusic();
    }
    public NiceCar(Engine engine,MusicPlayer player){
        this.engine=engine;
        this.player=player;

    }
    public void upgradeEngine(Engine engine){
        this.engine=engine;
    }
    public void upgradeMusic(MusicPlayer player){
        this.player=player;
    }
    public Engine getEngine() {
        return engine;
    }
    public MusicPlayer getPlayer() {
        return player;
    }

    public
    void engineStart(){
        engine.start();
    }
    void enginesStop(){
        engine.stop();
    }
    void MusicStart(){
        player.start();
    }
    void MusicStop(){
        player.stop();
    }
}

