// School System with Different Roles
// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.

// Base class representing a Person
class Person {
    String name; // Person's name
    int age; // Person's age

    // Constructor to initialize person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the role of a person (default is "Person")
    public void displayRole() {
        System.out.println("Role: Person");
    }
}

// Subclass representing a Teacher, extending the Person class
class Teacher extends Person {
    String subject; // Subject taught by the teacher

    // Constructor to initialize teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age); // Calling the parent class constructor
        this.subject = subject;
    }

    // Overriding displayRole to show the role of a teacher
    @Override
    public void displayRole() {
        super.displayRole(); // Calling the parent class displayRole
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass representing a Student, extending the Person class
class Student extends Person {
    int grade; // Grade level of the student

    // Constructor to initialize student details
    public Student(String name, int age, int grade) {
        super(name, age); // Calling the parent class constructor
        this.grade = grade;
    }

    // Overriding displayRole to show the role of a student
    @Override
    public void displayRole() {
        super.displayRole(); // Calling the parent class displayRole
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass representing a Staff member, extending the Person class
class Staff extends Person {
    String department; // Department of the staff member

    // Constructor to initialize staff details
    public Staff(String name, int age, String department) {
        super(name, age); // Calling the parent class constructor
        this.department = department;
    }

    // Overriding displayRole to show the role of a staff member
    @Override
    public void displayRole() {
        super.displayRole(); // Calling the parent class displayRole
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class to simulate the school system
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating instances for each class
        Person person = new Person("Alice", 30);
        Teacher teacher = new Teacher("Bob", 40, "Math");
        Student student = new Student("Charlie", 15, 10);
        Staff staff = new Staff("David", 25, "Administration");

        // Storing instances in an array for easy iteration
        Person[] people = {person, teacher, student, staff};

        // Looping through each person and displaying their details
        for (Person p : people) {
            System.out.println("Name: " + p.name); // Display name
            System.out.println("Age: " + p.age); // Display age
            p.displayRole(); // Display the role (teacher, student, etc.)
            System.out.println();
        }
    }
}
