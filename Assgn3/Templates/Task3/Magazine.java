package Assgn3.Templates.Task3;

public class Magazine extends LibraryItem {
    private String publisher;
    
    public Magazine(String title, String publisher) {
        super(title, "");
        // Initialize publisher
        this.publisher = publisher;
    }
    
    @Override
    public void displayInfo() {
        // Display magazine title and publisher
        System.out.println("Magazine Information:");
        super.displayInfo();
        System.out.println("Publisher: " + publisher);
    }
}

