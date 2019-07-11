package org.dimigo.inheritance;

public class Animal {
    private String name;

    public void eat(){
        System.out.println("냠냠");
    }


    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("쿨쿨");
    }

    public void bark() {
        System.out.println("멍멍");
    }

    public String toStirng(){
        return "제 이름은 " +name + "입니다";
    }
}
