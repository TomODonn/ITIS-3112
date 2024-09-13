package Assgn3.Templates.Task2;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        super(4);
        // Initialize width and height
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        // Calculate and return the area of the rectangle
        return width * height;
    }
}

