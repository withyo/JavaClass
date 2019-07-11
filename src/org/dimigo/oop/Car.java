package org.dimigo.oop;

import java.util.*;

public class Car {


    public Car() {
    }


    private int horsePower;
    private int maxSpeed;
    private long price;
    private double fuelEfficiency;
    private String company;

    public void forward() {
       System.out.println("전진합니다!");
    }


    public void backward() {
        System.out.println("후진합니다!");
    }


    public boolean stop() {
        System.out.println("정지합니다!");
        return true;
    }


    public void turnRight(int angle) {
        System.out.println(angle + "도 우회전합니다!");
    }


    public void turnLeft(int angle) {
        System.out.println(angle + "도 좌회전합니다!");
    }

}