package org.dimigo.oop;

public class Calculator {
    /*** 인스턴스 필드 ***/
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator(){

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /****** 인스턴스 메소드 (static 이 없는 메소드)(객체가 있어야만 쓸 수 있다) ******/
    public void powerOn() {
        if (this.powerFlag == false) {
            System.out.println("전원을 켭니다");
            this.powerFlag = true;
        }
    }
    public void powerOff(){
        if (this.powerFlag) {
        System.out.println("전원을 끕니다");
        this.powerFlag = false;
        }
    }

    // this 는 나를 호출한 그 객체

    public int add(){
        System.out.println(this);
        this.powerOn();
        return this.num1+this.num2;
    }

    public int sub(){
        this.powerOn();
        return this.num1-this.num2;
    }

    public int mul(){
        this.powerOn();
        return this.num1*this.num2;
    }

    public double div(){
        this.powerOn();
        return (double)this.num1/this.num2;
    }


    public static void main(String[] args) {
        Calculator c = new Calculator(10,20); // num1,num2는 인스턴스 필드 -> 객체 필요
        System.out.println(c.num1);
        System.out.println(c.num2);
        c.powerOn();
    }


}
