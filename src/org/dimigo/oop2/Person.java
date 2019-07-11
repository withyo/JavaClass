package org.dimigo.oop2;

public class Person {
    private final String type = "포유류";
    private final String birthDate;
    private String name;

    public static final String TYPE = "영장류"; // 자바에서 진정한 상수를 만드는 법 (모든 객체에서 공유되게)

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020125", "한효민");
        Person p2 = new Person("19911031", "이승협");
        System.out.println(p1);
        System.out.println(p2);
        // p1.type = "파충류"; >>final은 초깃값 지정된 이후에 변경 불가함
        System.out.println(Person.TYPE);
    }
}
