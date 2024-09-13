package Task2;

public class Student {
    // Define student properties and methods
    private String id;
    private String name;

    // Constructor
    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    // Setters and getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // String output
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}