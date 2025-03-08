// Employee Management System
// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

import java.util.ArrayList;
import java.util.List;

// Abstract class Employee
// Fields: employeeId, name, and baseSalary (private for encapsulation)
// Abstract method calculateSalary() to be implemented by subclasses
// Concrete method displayDetails() to print employee details
abstract class Employee {
    private int employeeId;   // Employee ID
    private String name;      // Employee Name
    private double baseSalary; // Base Salary

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method for calculating salary, to be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method for displaying employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId); // Print employee ID
        System.out.println("Name: " + name); // Print employee name
        System.out.println("Base Salary: " + baseSalary); // Print base salary
    }

    // Getter and Setter methods for encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

// FullTimeEmployee is a subclass of Employee
// Implements the calculateSalary() method based on fixed base salary and bonus
class FullTimeEmployee extends Employee {
    private double bonus; // Bonus for full-time employees

    // Constructor to initialize full-time employee details
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary); // Call superclass constructor
        this.bonus = bonus; // Initialize bonus
    }

    // Calculate salary for full-time employee (base salary + bonus)
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus; // Return total salary (base + bonus)
    }
}

// PartTimeEmployee is a subclass of Employee
// Implements the calculateSalary() method based on work hours and base salary
class PartTimeEmployee extends Employee {
    private double workHours; // Work hours for part-time employees

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(int employeeId, String name, double baseSalary, double workHours) {
        super(employeeId, name, baseSalary); // Call superclass constructor
        this.workHours = workHours; // Initialize work hours
    }

    // Calculate salary for part-time employee (base salary * work hours)
    @Override
    public double calculateSalary() {
        return getBaseSalary() * workHours; // Return total salary based on work hours
    }
}

// Interface Department with methods to assign and get department details
interface Department {
    void assignDepartment(String department); // Method to assign department
    void getDepartmentDetails(); // Method to display department details
}

public class EMS {
    public static void main(String[] args) {
        // Create a list of employees (both full-time and part-time)
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Alice", 50000, 10000)); // Add full-time employee
        employees.add(new PartTimeEmployee(2, "Bob", 20000, 20)); // Add part-time employee

        // Loop through the list of employees and display their details
        for (Employee employee : employees) {
            employee.displayDetails(); // Display employee details (ID, Name, Base Salary)
            System.out.println("Salary: " + employee.calculateSalary()); // Display calculated salary
            System.out.println(); // Print an empty line for separation between employee details
        }
    }
}
