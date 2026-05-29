
public class Teacher extends Person {
    private String department;

    // Constructor
    public Teacher(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    // Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
