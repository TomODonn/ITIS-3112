package Assgn3.Templates.Task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 4);
        
        // Calculate and display the areas of the rectangle and triangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        
        
    }
}

