package org.dimigo.oop2;

public class Mediaplayer {
    private int volume;
    private static Mediaplayer instance = new Mediaplayer();

    private Mediaplayer(){

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static Mediaplayer getInstance() {
        return instance;
    }


}
