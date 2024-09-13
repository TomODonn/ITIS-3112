package Assgn3.Templates.Task2;

public abstract class Shape {
    protected int sides;
    
    public Shape(int sides) {
        // Initialize the number of sides
        this.sides = sides;
    }
    
    public abstract double calculateArea();
}
