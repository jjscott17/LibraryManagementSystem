# **LibraryManagementSystem**
By Joseph Scott and Hung Nguyen
## Description
Create an application that manages a library and it's contents by allowing users to create accounts, borrow and return books, search for a book, or browse the library's contents. <br><br>

## Key Features
* **User Account Management:** Users will be able to create an account with a username and a password.
* **Search Contents:** Allow users to search for a book by name.
* **Check-out/Return Books:** Users can check out or return books from the library, which will be tied to the user's account.
* **Browse by Category:** Books will be categorized by genre. Users will be able to browse each genre to find books without searching a specific name.
* **Filters:** Books can be sorted according to a filter, such as being in alphabetical order, reverse alphabetical order, release date, etc.

## OOP Principles Applies
* **Encapsulation:** User account will be secure. It also has secure handling on the information of books. 
* **Inheritance:** Define a general Book class with subclasses like eBook and PhysicalBook.
* **Polymorphism:** Implement a search function that can search using title, author, and ISBN.
* **Abstraction:** Use interface that allows user to search, borrow, or return books. 

## Technologies
* GUI: JavaFX or Swing for user interface
* Database:  MySQL or PostgreSQL for storing in information about books like book title, and author.
