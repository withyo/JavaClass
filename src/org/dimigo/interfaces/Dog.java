package org.dimigo.interfaces;

public class Dog implements IAnimal {


    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    public void wag(){
        System.out.println("꼬리를 흔든다" );
    }
}
