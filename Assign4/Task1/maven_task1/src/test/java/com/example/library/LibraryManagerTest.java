package com.example.library;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LibraryManagerTest {
    private LibraryManager libraryManager;

    @Before
    public void setUp() {
        // TODO: Initialize the libraryManager object and add some initial books
        libraryManager = new LibraryManager();

        libraryManager.addBook(new Book("It: A Novel", "Stephen King", "9781982127794"));
        libraryManager.addBook(new Book("1984", "George Orwell", "9781328869333"));
        libraryManager.addBook(new Book("Ulysses", "James Joyce", "9781657558304"));
    }

    @Test
    public void testAddBook() {
        // TODO: Write test case for the addBook() method
        Book book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "9781551923987");

        libraryManager.addBook(book);

        List<Book> books = libraryManager.searchByTitle("Harry Potter and the Philosopher's Stone");

        assertEquals(1, books.size());
        assertEquals("J.K. Rowling", books.get(books.size() - 1).getAuthor());
        
    }

    @Test
    public void testSearchByTitle() {
        // TODO: Write test case for the searchByTitle() method
        List<Book> books = libraryManager.searchByTitle("Ulysses");

        assertEquals(1, books.size());
        assertEquals("James Joyce", books.get(0).getAuthor());

    }

    @Test
    public void testUpdateBookDetails() {
        // TODO: Write test case for the updateBookDetails() method

        boolean updated = libraryManager.updateBookDetails(
                                    "It: A Novel",
                                    "Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        assertTrue(updated);

        List<Book> books = libraryManager.searchByTitle("Harry Potter and the Sorcerer's Stone");
        assertEquals(1, books.size());
        assertEquals("J.K. Rowling", books.get(0).getAuthor());

    }

    @Test
    public void testUpdateBookDetailsNonExistingBook() {
        // TODO: Write test case for the updateBookDetails() method with a non-existing book
        boolean updated = libraryManager.updateBookDetails(
                                    "Harry Potter and the Chamber of Secrets",
                                    "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling");

        assertFalse(updated);
    }
}
