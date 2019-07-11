package org.dimigo.oop2;

public class SingletonTest {
    public static void main(String[] args) {
       Singleton s1 =  Singleton.getInstance(); //new 로는 기본생성자가 private 이기 때문에 못만듬
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true !
    }
}
