package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper 클래스 : Primitive Type을 Wrapping하는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE); //인티저 비트 (32)

        System.out.println(Integer.toBinaryString(10)); //2진수로 바꿔라
        System.out.println(Integer.toOctalString(10)); //8진수로 바꿔라
        System.out.println(Integer.toHexString(10)); //16진수로 바꿔라 -- a

        //Boxing
        //1) 생성자
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1==i2); //false
        System.out.println(i1.equals(i2));//true

        //2) valueOf()
        Integer i3=Integer.valueOf(100);
        Integer i4=Integer.valueOf("100");
        Double d = Double.valueOf(3.14);

        //UnBoxing
        int r1 = i3.intValue();
        double r2 = d.doubleValue();

        //문자열 -> Primitive Type
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("3.14");

        // 100 + 200 = 300
        System.out.println(args[0]); // "100"
        System.out.println(args[1]); //"200" -> 문자열임
        System.out.println(args[0]+args[1]); //문자열로 나옴

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);


        Integer i5 = new Integer(1000);
        Integer i6 = new Integer(2000);
        System.out.println(i5 + i6);

        Integer obj1 = 1000; //AutoBoxing (내용물 자동으로 포장해줌 new 안해도)
        int r3 = obj1 + 100; //AutoUnBoxing (자동으로 내용물 뽑아서 씀)

        //총 몇번의 autoboxing, autounboxing 이 일어났는가? 3번 3번
        Integer obj2 = 10;              // 박싱 1번
        Integer obj3 = obj2 + 20;       // 언박싱 1, 박싱 1
        Integer result = obj2 + obj3;   // 언박싱 2번, 박싱 1
    }
}
