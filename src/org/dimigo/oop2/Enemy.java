package org.dimigo.oop2;

public class Enemy {
    public void play(){
        Mediaplayer mp = Mediaplayer.getInstance();
        mp.setVolume(mp.getVolume() + 10);
    }
}
