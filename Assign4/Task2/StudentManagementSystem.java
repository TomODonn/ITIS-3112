package Task2;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    // Implement student management system functionalities using collection classes
    private List<Student> students;

    // Default constructor
    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    };

    // Getter
    public List<Student> getStudents() {
        return students;
    }

    // Adding of new student to management system
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student: " + student.getName() + " added to system.");
    }

    // Search for Student by ID
    public Student searchStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    public void displayAllStudents() {
        System.out.println("All Students: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}