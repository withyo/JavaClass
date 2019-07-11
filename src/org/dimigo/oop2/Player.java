package org.dimigo.oop2;

public class Player {
    public void play(){
        Mediaplayer mp = Mediaplayer.getInstance();
        mp.setVolume(10);
    }
}
