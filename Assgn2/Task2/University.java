
import java.util.ArrayList;
import java.util.List;

public class University {
    // Attributes
    String name;
    List<Department> departments;

    // Constructor
    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(Department department) {
        // Add department to the list
        departments.add(department);
    }

    // Method to display university details
    public void displayDetails() {
        // Display university details
        System.out.println("University: " + name + "\nDepartments:\n");
        for(Department department : departments) {
            department.displayDetails();
        }
    }
}
