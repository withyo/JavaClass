package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //String 문자열 추가
        String str = "디미고";
        str += "2학년 ";
        str += "5반 ";
        str += "한효민";

        //StringBuilder 로 문자열 추가
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("5반 ");
        System.out.println(sb.toString());
        System.out.println(sb);

        compareSpeed();
    }

    private static void compareSpeed() {
       long start =  System.currentTimeMillis();

       String str = "abc";
       StringBuffer sb= new StringBuffer("abc");
       StringBuilder sb2 = new StringBuilder("abc");
       for(int i=0;i<100000;i++){
           //str += "def";
           sb2.append("def");
       }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
