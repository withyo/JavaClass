package org.dimigo.oop2;

public class Car {
    // 정적 필드
    private static String company;
    // 인스턴스 필드
    private String name;

    //static block -> 스태틱 필드에 대한 초기화 , 한번만 호출
    static {
        company = "기아";
        System.out.println("static block 호출");

    }

    public Car(String name) {
        this.name = name;
        System.out.println("constructor 호출"); // 매번 호출
    }

    public static String getComapny() {
        return company;
    }

    public static void setComapny(String comapny) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company + " : "+name;
    }
}
