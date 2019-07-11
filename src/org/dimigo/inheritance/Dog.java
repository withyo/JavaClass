package org.dimigo.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    //dog 에만 있는 메소드 추가
    public void wag(){
        System.out.println("꼬리를 흔든다");
    }

}
