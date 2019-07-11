package org.dimigo.oop;

public class CountTesst {
    public static void main(String[] args) {
        for(int i = 0 ; i<10;i++){
            new Count();
        }
        System.out.println(Count.getCnt());
    }
}
