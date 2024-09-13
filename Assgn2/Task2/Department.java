
import java.util.ArrayList;
import java.util.List;

public class Department {
    // Attributes
    String name;
    List<Course> courses;

    // Constructor
    public Department(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(Course course) {
        // Add course to the list
        courses.add(course);
    }

    // Method to display department details
    public void displayDetails() {
        // Display department details
        System.out.println("Department: " + name + "\nCourses:");
        for (Course course : courses) {
            course.displayDetails();
        }
        System.out.println();

    }
}
