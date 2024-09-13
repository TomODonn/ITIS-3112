package Assgn3.Templates.Task3;

public class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }
    
    @Override
    public void displayInfo() {
        // Display book title and author
        System.out.println("Book Information:");
        super.displayInfo();
    }
}

