
public class ElectricCar extends Vehicle {
    // Additional attributes
    int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    // Getter for Electric Car batterCapacity.
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // Method to display electric car details
    @Override
    public void displayDetails() {
        // Display electric car details
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
