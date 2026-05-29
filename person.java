// Base class (Inheritance)
public class Person {
    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Method to display info (will be overridden)
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
