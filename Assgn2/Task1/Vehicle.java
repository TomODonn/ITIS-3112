
public class Vehicle {
    // Attributes
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter for Vehicle brand.
    public String getBrand() {
        return brand;
    }

    // Getter for Vehicle year.
    public int getYear() {
        return year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        // Display vehicle details
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
