package org.dimigo.oop;

public class Book {
    private String title ;
    private String author;
    private int page;


   // 기본 생성자 (생성자는 리턴부가 없음) 생성자의 역할 : 필드 초기화

    public Book(){
        System.out.println("기본 생성자 호출");
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title) {
        this(title, "저자미상");
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String toString() {
        return "Book{" +
                "title=" + title  +
                ", author=" + author  +
                ", page=" + page +
                '}';
    }

   /*
    //Getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;

    }

    public int getPage() {
        return page;
    }


    //Setter
    public void setTitle(String title) {
        this.title = title; //내 개체 에 있는 타이틀에다가 새로운 팅;ㅌ,ㄹㅇ,ㄹ낳얼
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public void setPage(int page) {
        if (page > 0) {
            this.page = page;
        }
    }
    */


}