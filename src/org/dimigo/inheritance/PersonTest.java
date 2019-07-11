package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유",26,162,48);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("한효민",18,170,1,"2532");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.rollCall();
        s.studyAtNight();


        Teacher t = new Teacher("박성수",30,190,65,"정통");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.doTask();

    }
}
