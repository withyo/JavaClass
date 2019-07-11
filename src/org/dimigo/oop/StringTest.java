package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //1. 문자열 리터럴 방식 . 리터럴 풀에 만듦

        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);

        //2. new 객체 생성 방식 (똑같은 문자열도 계속 만듦)
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);

        // 문제
        System.out.println(dog1 == "멍멍이"); // true
        System.out.println(cat1 == "야옹이"); // false

        //==연산자는 주솟값 비교
        //문자열 자체를 비교할 때는 equals 메소드 사용


        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id = "null";

        //id가 "admin"이면 "관리자입니다" 출력
        //"admin" 이 아니면 "관리자 아님" 출력

        if ("admin".equalsIgnoreCase(id)) { //"admin".equals
            System.out.println("관리자입니다");
        } else {
            System.out.println("관리자 아님");


            testString();
        }
    }
    //0~13

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length()); //14
        System.out.println(s.substring(3)); //defgABCDFG
        System.out.println(s.substring(3, 6)); //def
        System.out.println(s.indexOf("C")); //C->9
        System.out.println(s.charAt(9)); //0->C
        System.out.println(s.concat("ABC")); //a~gABC
        System.out.println("     ABC     ".trim()); //[ABC]
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase().trim());
        System.out.println(s.replace('a','A')); //'a' -> 'A'
        System.out.println(s.startsWith("abc")); //abc
        System.out.println(s.endsWith("FG"));
    }
}
