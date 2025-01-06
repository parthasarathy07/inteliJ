package com.java.oops.interfaces.ifs1Class3;

public interface MusicPlayer {
    void start();
    default  void stop(){
        System.out.println("Music player is started");
    }
}
