package org.dimigo.oop2;

public class GameTest {
    public static void main(String[] args) {
        Mediaplayer mp = Mediaplayer.getInstance();
        System.out.println(mp.getVolume()); // 0

        new Player().play();
        System.out.println(mp.getVolume()); // 10
        new Enemy().play();
        System.out.println(mp.getVolume()); // 20
    }
}
