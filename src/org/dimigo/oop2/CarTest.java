package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("펠리세이드"),
                new Car("그랜저")
        };

//        Car.setComapny("현대");
//        cars[0].setComapny("기아");
        for(Car car : cars){
            System.out.println(car); // 기아 제네시스 , 기아 펠리세이드, 기아 ...
        }
        System.out.println(Integer.parseInt("100"));
        System.out.println(Math.abs(-123));
        System.out.println(Math.sin(Math.toRadians(30)));
    }
}
