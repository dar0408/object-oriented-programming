// Program to generate a Student Report with grade based on marks
// Problem Statement: Create a Student class with attributes name, rollNo, and marks. 
// Add methods to:
// 1. Assign grades based on marks.
// 2. Display student details including grade.

class Student {
    String name;  // Name of the student
    int rollNo;   // Roll number of the student
    double marks; // Marks obtained by the student

    // Constructor to initialize the student's name, roll number, and marks
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to assign a grade based on the student's marks
    public String grade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    // Method to display the student's details, including the assigned grade
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());  // Calling grade method to display grade
    }
}

// Main class to run the program and create student objects
public class StudentReport {
    public static void main(String[] args) {
        // Creating Student objects with their details
        Student s1 = new Student("John", 101, 95);
        Student s2 = new Student("Jane", 102, 85);

        // Displaying the details of each student
        s1.display();
        s2.display();
    }
}
