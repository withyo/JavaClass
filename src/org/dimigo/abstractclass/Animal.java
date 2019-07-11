package org.dimigo.abstractclass;

public abstract class Animal { //추상메소드가 하나라도 있으면 추상클래스가 되어야 함.
    public void eat(){
        System.out.println("냠냠");
    }

    //반드시 오버라이딩 하라고 강제화 !
    public abstract void bark();
}
