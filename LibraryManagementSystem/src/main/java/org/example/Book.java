package org.example;

public class Book {
    private String bookTitle;
    private int numberOfPages;

    public Book() {}

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

