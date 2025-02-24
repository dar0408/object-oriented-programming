// Program to Display Employee Details
// Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.


// Class representing an Employee with id, name, and salary attributes
class Employee {
    private int id;        // Private variable to store employee ID
    private String name;   // Private variable to store employee name
    private double salary; // Private variable to store employee salary

    // Constructor to initialize employee details
    public Employee(int id, String name, double salary) {
        this.id = id;       // Assigning parameter value to instance variable
        this.name = name;   // Assigning parameter value to instance variable
        this.salary = salary; // Assigning parameter value to instance variable
    }

    // Method to display employee details
    public void display() {
        System.out.println("Id: " + id);       // Printing employee ID
        System.out.println("Name: " + name);   // Printing employee name
        System.out.println("Salary: " + salary); // Printing employee salary
    }
}

// Main class to demonstrate the Employee class functionality
public class EmployeeDetail {
    public static void main(String[] args) {
        // Creating employee objects with id, name, and salary
        Employee emp1 = new Employee(101, "John", 50000);
        Employee emp2 = new Employee(102, "Smith", 60000);

        // Displaying details of employees
        emp1.display();
        emp2.display();
    }
}
