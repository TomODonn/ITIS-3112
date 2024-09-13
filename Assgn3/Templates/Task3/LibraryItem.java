package Assgn3.Templates.Task3;

public class LibraryItem {
    protected String title;
    protected String author;
    
    public LibraryItem(String title, String author) {
        // Initialize title and author
        this.title = title;
        this.author = author;
    }
    
    public void displayInfo() {
        // Display title and author
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

