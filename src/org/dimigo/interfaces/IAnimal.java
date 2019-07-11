package org.dimigo.interfaces;

public interface IAnimal {
    //상수 (인터페이스 에서는 자동으로 public static final 이 붙음)
   String FARM_NAME = "디미 동물농장";

   // 추상 메소드 (인터페이스 에서는 자동으로 public abstract 이 붙음) (JDK 7)
   // public void eat();
   // abstract void sleep();
    void bark ();

    //JDK 8 부터
    //디폴트 메소드 ( 자동으로 public)
    default void eat() {
        System.out.println("냠냠");
    }


    default void sleep() {
        System.out.println("쿨쿨");
    }

    //static 메소드
    public static void welcome(){
        System.out.println(FARM_NAME + "에 오신걸 환영합니다");
    }
}
