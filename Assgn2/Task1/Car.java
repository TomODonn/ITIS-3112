public class Car extends Vehicle {
    // Additional attributes
    String fuelType;

    // Constructor
    public Car(String brand, int year, String fuelType) {
        super(brand, year);
        this.fuelType = fuelType;
    }

    // Getter for Car fuelType.
    public String getFuelType() {
        return fuelType;
    }
    // Method to display car details
    @Override
    public void displayDetails() {
        // Display car details
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}
