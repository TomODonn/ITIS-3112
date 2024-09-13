public class Main {
    public static void main(String[] args) {
        // Create instances of Car and ElectricCar
        // Initialize their attributes
        Car car = new Car("Toyota", 2022, "Gasoline");
        ElectricCar car2 = new ElectricCar("Tesla", 2023, 85);

        // Display the details of each vehicle
        System.out.println("Car:");
        car.displayDetails();

        System.out.println("\n");
        
        System.out.println("Electric Car:");
        car2.displayDetails();
    }
}

