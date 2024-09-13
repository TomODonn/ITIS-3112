package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StudentManagementSystem
        // Create variables
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice; // int for system selection
        String id; // String to hold id input for
        Student student;

        // Adding test students to system.
        Student student1 = new Student("1", "Mike");
        Student student2 = new Student("2", "Lewis");
        Student student3 = new Student("3", "Aria");

        system.addStudent(student1);
        system.addStudent(student2);
        system.addStudent(student3);

        // Invoke methods from the student management system
        while (true) {
            System.out.println("\n Welcome to the Student Management System.");
            System.out.println("1. Add a Student.");
            System.out.println("2. Search for Student by ID.");
            System.out.println("3. Display all Students in System.");
            System.out.println("4. Exit Management System.");
            System.out.print("\nPlease enter your selection : ");
            try {
                choice = scanner.nextInt();

                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        id = scanner.nextLine();
                        student = new Student(id, name);
                        system.addStudent(student);

                        break;

                    case 2:
                        System.out.print("Enter ID of Student: ");
                        id = scanner.nextLine();

                        student = system.searchStudentById(id);

                        if (student != null) {
                            System.out.println("Student found: " + student.toString());
                        } else {
                            System.out.println("Student " + id + " not found.");
                        }

                        break;

                    case 3:
                        system.displayAllStudents();

                        break;

                    case 4:
                        System.out.println("Exiting Student Management System.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Please enter a valid number.");
                scanner.nextLine();

            }

        }
        // Display the results
    }
}