package org.dimigo.oop;

public class ArrayBasic {

    public static void main(String[] args) {
        // 기본형 : int, long, double, char, float, boolean, short (디폴트 값이 있음)
        // 참조형 : String, Book, Car, Scanner, Random, StringBuilder

        Book book = null;
        Car car = null;

        int[] intArr = new int[5];
        printArray(intArr);

        //double 5개 짜리 타입 배열 생성 후 출력
        double[] doubleArr = null;
        doubleArr = new double[5];
        printArray(doubleArr);


        //배열 선언 시 초기화
        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[] {1, 2, 3, 4, 5};

        printArray(intArr2);

        // 참조형 배열 (reference 타입)
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "엔플라잉";
        strArr[1] = "EXO";
        strArr[2] = "SF9";
        //strArr[3] = "TEST"; -> 범위 벗어나서 에러
        printArray(strArr);


        String[] strArr2= {"엔플라잉","EXO","SF9"};
        String[] strArr3=new String[]{"엔플라잉","EXO","SF9"};
        printArray(strArr2);

        // Book 타입 2개짜리 배열 생성
        // 각 방에 Book 객체 생성 후 출력

        Book[] bookArr= new Book[2];

        bookArr[0] = new Book("수학의 바이블", "김재영",100);
        bookArr[1] = new Book("워드마스터", "전유원",200);
        printArray(bookArr);

        Book[] bookArr2 = new Book[]{
                new Book ("수학의 바이블", "김재영", 100),
                new Book("워드마스터", "전유원",200)
        };
        printArray(bookArr2);

        //배열 사용 시 주의사항

        int[] intArr4 = null;
     //   System.out.println(intArr4.length); //널포인터익셉션

        intArr4 = new int[3]; //0~2
        System.out.println(intArr4[intArr4.length-1]);

        String[] strArr4 = new String[3];
        System.out.println(strArr4[0]);

        Book[ ] bookArr3 = new Book[3];
        System.out.println(bookArr3[0].getTitle());

        String[] strArr5 = null;
       // strArr5 = {"수힉","영어","자바"}; 이건 안됨
        strArr5 = new String[]{"수힉","영어","자바"};
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {
            System.out.println(value);

            // System.out.printf("책제목:%s, 저자명:%s,페이지수:%d\n",
            //value.getTitle(),value.getAuthor(),value.getPage());
        }
    }

    private static void printArray(double[] doubleArr) { //오버로딩
        for(double d : doubleArr){
            System.out.println(d + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
