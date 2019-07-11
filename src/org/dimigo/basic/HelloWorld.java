package org.dimigo.basic;

public class HelloWorld {
    public static void main(String[] args) {
        //2.문자형
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.printf("%c,%c,%c\n", c1, c2, c3);

        //문자열
        String name = "ITZY";
        System.out.println("My name is " + name);

        // 3. 정수형
        int i1=10;
        int i2=0b00001010;
        int i3=012;
        int i4=0x0A;
        System.out.printf("%d %d %d %d\n", i1,i2,i3,i4);

        // byte 타입 (-128~127) -> 최솟값 128 최댓값 127
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);
//      b1=-129;
        b1--; //최솟값에서 1빼면 127(최댓값) 나옴
        b2++; //최댓값에서 1더하면 -128 나옴
        System.out.println(b1); //127
        System.out.println(b2); //-128

        //정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "~" + Byte.MAX_VALUE);

        // 문제 : 100억을 저장하려면? (0이 10개)
            //long a = 10000000000; //100억 값 자체가 인티저형이라서 오류 뜸
        long a = 10000000000L; //숫자 뒤에 L붙히면 롱 타입으로 바뀜

        // 4. 실수형
        float f1 = 3.14f; //3.14 다음에 아무것도 안치면 얘는 더블 타입
        double d1 = 3.14;
        System.out.printf("%f, %f\n",f1, d1);

        // 실수는 정밀도가 중요
        float f2 = 0.12345678901234567890f;
        double d2= 0.12345678901234567890;
        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.345, "ITZY");

    }
}
