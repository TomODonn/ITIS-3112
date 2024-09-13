package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;

    // Constructor
    public LibraryManager() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to search for books by title
    public List<Book> searchByTitle(String title) {
        // Return a list of books that match the title
        List<Book> search = new ArrayList<>();
        for (Book book: books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                search.add(book);
            }
        }

        return search;
    }

    // Method to update book details
    public boolean updateBookDetails(String title, String newTitle, String newAuthor) {
        // Return true if the book is found and details are updated, false otherwise
        for (Book book: books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                return true;
            }
        }
        return false;
    }
}
