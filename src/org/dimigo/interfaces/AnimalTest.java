package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        //IAnimal.FARM_NAME = "디미 동물농장2";
        IAnimal.welcome();

        IAnimal[] animals = {
                new Dog(), new Cat()
        };

        for(IAnimal a : animals) {
            a.eat();
            a.sleep();
            a.bark();
            //wag() 호출하려면?
            if (a instanceof Dog) {
                ((Dog) a).wag(); //a를 dog 로 타입캐스
            }
        }
    }
}
