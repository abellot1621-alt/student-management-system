// Main class to run the progr
public class Main {
    public static void main(String[] args) {
        // Classes & Objects
        Student s1 = new Student("Alice", "S001", 3.5);
        Student s2 = new Student(); // default constructor
        Teacher t1 = new Teacher("Dr. John", "T001", "Computer Science");

        // Encapsulation
        s2.setGpa(4.0);

        // Inheritance + Polymorphism
        Person p = new Student("Bob", "S002", 3.8); // superclass reference
        p.displayInfo(); // calls Student’s overridden method

        // Method Overloading
        s1.enrollCourse("Java Programming");
        s1.enrollCourse("Data Structures", 3);

        // Display info
        s1.displayInfo();
        s2.displayInfo();
        t1.displayInfo();
    }
}
