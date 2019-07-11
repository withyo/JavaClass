package org.dimigo.oop;

public class Calculator2 {

    /** 정적(static) 필드 **/ //클래스 명. 어쩌구는 다 스태틱
    public static double PI = 3.141592;

    //객체마다 powerFlag가 존재해야함. 계산기는 따로따로니까 !
    public boolean powerFlag;
    //클래스명.필드명 으로 사용


    /****** 인스턴스 메소드  ******/ //인스턴스 필드를 쓰는 메소드에서는 인스턴스를 써야 됨,객체마다 다른 값을 가져야 할 때 사용
    public  void powerOn() {
        if (powerFlag == false) {
            System.out.println("전원을 켭니다");
            powerFlag = true;
        }
    }
    public void powerOff(){
        if (powerFlag) {
        System.out.println("전원을 끕니다");
        powerFlag = false;
        }
    }

    /**** 정적 (static) 메소드 ****/ //클래스 당 하나. 동일 클래스에서 생성된 모든 객체에서 하나의 데이터를 공유해야할 때 사용
    public static int add(int num1, int num2,Calculator2 c){
        c.powerOn();
        return num1+num2;
    }

    public static int sub(int num1, int num2,Calculator2 c){
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2,Calculator2 c){
        c.powerOn();
        return num1*num2;
    }

    public static double div(int num1, int num2,Calculator2 c){
        c.powerOn();
        return (double)num1/num2;
    }

}
