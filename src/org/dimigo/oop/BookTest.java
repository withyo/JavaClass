package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book; // Reference 변수 타입/변수이름 (레퍼런스 변수 선언. int i랑 똑같음
        book = new Book(); // 객체 생성 후 변수에 할당
        Book book2 = new Book(); // 위에거 한줄로 줄이기

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 정석");
        book.setAuthor("홍성대");
        book.setPage(350);

        Book book3 = new Book("Word Master","전유원",100);
        System.out.println(book3.getTitle());

    }
}
