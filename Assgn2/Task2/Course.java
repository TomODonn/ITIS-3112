import java.util.ArrayList;
import java.util.List;

public class Course {
    // Attributes
    String name;
    List<Instructor> instructors;

    // Constructor
    public Course(String name) {
        this.name = name;
        this.instructors = new ArrayList<>();
    }

    // Method to add an instructor
    public void addInstructor(Instructor instructor) {
        // Add instructor to the list
        instructors.add(instructor);
    }

    // Method to display course details
    public void displayDetails() {
        // Display course details
        System.out.println(name);
        if (!instructors.isEmpty()){
            System.out.println("Instructors:");
        }
        for (Instructor instructor : instructors) {
            instructor.displayDetails();
        }

    }
}

