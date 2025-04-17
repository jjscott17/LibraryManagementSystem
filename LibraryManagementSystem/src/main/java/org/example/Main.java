package org.example;

public class Main {
    public static void main(String[] args) {
        Search.main(args);
        String bookTitle = Search.bookTitle;
        Book book = new Book();
        book.searchBooks(bookTitle);
    }
}