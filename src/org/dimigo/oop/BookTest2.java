package org.dimigo.oop;

public class BookTest2 {

    private static void compare(){
        int a = 10;
        int b = a;
        System.out.println(a == b ? "true" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "true" : "false");

        book2.setTitle("수학의 정석");
        System.out.println(book2.getTitle());
        System.out.println(book.getTitle());
    }


    public static void main(String[] args) {
        compare();
        System.out.println("-------------------");
        
        int num = 5;
        methodA(num);
        System.out.println(num); //5
        System.out.println("-------------------");

        Book book = new Book("수학의 바이블");
        methodB(book);
        System.out.println(book.getTitle());
        System.out.println("-------------------");

        methodC(book);
        System.out.println(book.getTitle()); //이것이 자바다 2
        System.out.println("-------------------");

        Book book2 = new Book();
        System.out.println(book2);
        System.out.println(book2.getTitle());
        System.out.println(book2.getTitle().length());
    }

    private static void methodC(Book book) {
        book.setTitle("이것이 자바다2");
        System.out.println(book.getTitle()); //이것이 자바다 2
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("이것이 자바다");
        System.out.println(book.getTitle());

    }

    private static void methodA(int num) {
        num++;
        System.out.println(num); //6

    }
}
