package Assgn3.Templates.Task3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Smith");
        Magazine magazine = new Magazine("Science Today", "National Geographic");
        
        // Display book information
        book.displayInfo();
        
        System.out.println();
        
        // Display magazine information
        magazine.displayInfo();
    }
}

