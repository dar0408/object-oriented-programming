// Problem 1: University Management System



// Student class with rollNumber, name, and CGPA
class Student {
    public int rollNumber;  // public field
    protected String name;  // protected field
    private double CGPA;    // private field

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter and Setter methods for CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// PostgraduateStudent class extending Student class
class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to access the protected member 'name' from the Student class
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("CGPA: " + getCGPA()); // Using public method to access private CGPA
    }
}

// Main class to demonstrate the implementation
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(101, "John Doe", 8.5);

        // Modify CGPA using public setter method
        student1.setCGPA(9.0);

        // Create a PostgraduateStudent object and display details
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Alice Smith", 8.7);
        pgStudent.displayPostgraduateDetails();
    }
}
