package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        //1. 산술연산자
        int a = 5, b=2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //몫이 2.5가 나오게 하려면?

        System.out.println((double)a/b);
        System.out.println(a * 1.0 /b);

        //a를 0으로 나누면
//        System.out.println(a / 0); 에러뜬당

        int i = 10;
        double d = 3.14;
        int r1 =(int)(i + d);
        double r2 = i + d;

        //int 간보다 작은 타입간의 연산은 int 로 바뀜
        short s1 = 1, s2 = 2;
        short s3 = (short)(s1 + s2); //int를 short로 타입캐스팅
        int r4 = s1 + s2;

        //Short-Circuit 테스트
        boolean flag = true;
        a = 10;
        b = 0;

        if(flag || (a /b ==0)) { // 숏서킷이 수행 된다면 에러 안뜸 (원래 0으로 나누면 에러뜸
            System.out.println("OR 연산");
        }

        if(!flag && (a / b ==0)){ // 숏서킷이 수행 된다면 에러 안뜸
            System.out.println("AND 연산");
        }


        // 문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 5;
        String name = "한효민";

        System.out.println(school + grade + ban + name); //디미고25황재현
        System.out.println(grade + ban + school + name); //7디미고 황재현

        //25디미고한효민을 출력하려면?
        System.out.println(grade + (ban + school) + name);
        System.out.println(""+grade + ban + school + name);
    }
}
