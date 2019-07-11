package org.dimigo.oop2;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static synchronized Singleton getInstance(){ //synchronized : 멀티스레드 환경에서 동기화..?
        if(instance == null){ //객체가 안만들어 졌으면
            instance = new Singleton(); //유일한 개체 하나 만들어줘야됨

        }
        return instance;
    }
}
