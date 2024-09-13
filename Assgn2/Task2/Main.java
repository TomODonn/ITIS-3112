
public class Main {
    public static void main(String[] args) {
        // Create an instance of University
        University university = new University("XYZ University");

        // Create departments, courses, and instructors
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        Course course1 = new Course("CSE101");
        Course course2 = new Course("CSE201");
        Course course3 = new Course("MAT101");
        Course course4 = new Course("MAT201");

        Instructor instructor1 = new Instructor("John Doe");
        Instructor instructor2 = new Instructor("Jane Smith");
        Instructor instructor3 = new Instructor("David Johnson");
        Instructor instructor4 = new Instructor("Emily Brown");

        // Add courses and instructors to departments
        course2.addInstructor(instructor1);
        course2.addInstructor(instructor2);
        course4.addInstructor(instructor3);
        course4.addInstructor(instructor4);

        dept1.addCourse(course1);
        dept1.addCourse(course2);
        dept2.addCourse(course3);
        dept2.addCourse(course4);

        // Add departments to the university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Display the details of the university
        university.displayDetails();
    }
}
