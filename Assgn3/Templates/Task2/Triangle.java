package Assgn3.Templates.Task2;

public class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        super(3);
        // Initialize base and height
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        // Calculate and return the area of the triangle
        return ((base * height) / 2.0);
    }
}

