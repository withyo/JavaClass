package org.dimigo.inheritance;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, int height, int weight,String studentId) { //생성자
        super(name,age,height,weight); //person에서 기본생성자 만들거나 여기에서 super로 명시적으로 나타내거나
        this.studentId = studentId;
    }

    public void studyAtNight() {
        System.out.println(getName() + "이/가 야자를 한다"); //private 이면 이르케 막 쓰면 안됨 (name)
    }

    public void rollCall() {
        System.out.println(getName() + "이/가 점호를 한다");
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}
