package org.example;

import java.util.HashMap;

public class Book {
    private String bookTitle;
    private int numberOfPages;

    private HashMap<String, Book> books;


    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book searchBooks(String bookTitle) {
        Book book;
        if(bookTitle.isBlank()) {
            System.out.println("Book title not found");
            return null;
        }
        /* else if() {

        } */
        else {
            book = new Book(bookTitle);
        }
        return book;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
