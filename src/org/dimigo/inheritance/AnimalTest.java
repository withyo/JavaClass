package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a=new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d=new Dog("멍멍이");
        System.out.println(d);
        d.bark();
        d.wag();

        Cat c=new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t=new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();


        Animal d2=new Dog("멍멍이2");
        Animal c2=new Cat("야옹이2");
        Animal t2=new Tiger("호돌이2");

        d2.bark();
        c2.bark();
        t2.bark();






        Animal[] animals={
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal animal:animals){
            doBark(animal);
        }







        Animal a2=new Dog("야옹이");
        a2.eat();
        //((Cat) a2).scratch();


//        Cat cat= (Cat) a2;
//        cat.scratch();

//        ((Cat) a2).scratch();

        //d: Dog, c: Cat, t : Tiger
        Animal dog = new Dog("멍멍이");
        System.out.println(d instanceof Dog);
        System.out.println(c instanceof Cat);
        System.out.println(t instanceof Tiger);
        System.out.println(dog instanceof Cat); //false
        System.out.println(dog instanceof Animal); //true


        doBark(dog);


        //메소드 오버라이딩은 자식이 부모와 접근제한이 같거나 더 넓어야

    }
    public static void doBark(Animal animal){
        System.out.println(animal);
        animal.eat();
        animal.bark();
        animal.sleep();

        if(animal instanceof Cat){
        Cat c = (Cat) animal;
        c.scratch();
        } else if(animal instanceof Dog){
            Dog d = (Dog) animal;
            d.wag();
        }
    }
}