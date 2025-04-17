package org.example;

import java.util.HashMap;

public class BookManager {
    // map of books with titles and pages
    private HashMap<String, Book> books;

    public BookManager() {
        books = new HashMap<>();

        // Add sample books
        books.put("Harry Potter", new Book("Harry Potter", 500));
        books.put("The Hobbit", new Book("The Hobbit", 300));
        books.put("1984", new Book("1984", 328));
    }

    // search for a book by it's title
    public Book searchBooks(String title) {
        if (title == null || title.isBlank()) return null;

        return books.get(title);
    }
}

