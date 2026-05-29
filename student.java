// Student is a Person (Inheritance)
public class Student extends Person {
    private double gpa;

    // Constructor
    public Student(String name, String id, double gpa) {
        super(name, id); // call Person constructor
        setGpa(gpa);     // use setter for validation
    }

    public Student() {
        super("Unknown", "0000");
        this.gpa = 0.0;
    }
 
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0) {
            System.out.println("GPA cannot be negative. Setting to 0.0");
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }

    // Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPA: " + gpa);
    }

    // Overloading (Polymorphism)
    public void enrollCourse(String courseName) {
        System.out.println(getName() + " enrolled in " + courseName);
    }

    public void enrollCourse(String courseName, int credits) {
        System.out.println(getName() + " enrolled in " + courseName + " (" + credits + " credits)");
    }
}
