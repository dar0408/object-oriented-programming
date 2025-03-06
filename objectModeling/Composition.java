// Problem 3: Company and Departments (Composition)

import java.util.ArrayList;

public class Composition {
    public static void main(String[] args) {
        // Create a Company object
        Company company = new Company("Company A");

        // Create Department objects
        Department department1 = new Department("Department 1");
        Department department2 = new Department("Department 2");

        // Create Employee objects
        Employee employee1 = new Employee("Alice");
        Employee employee2 = new Employee("Bob");
        Employee employee3 = new Employee("Charlie");

        // Add employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);

        // Add departments to the company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display all employees in the company
        company.displayEmployees();
    }
}

// Company class that contains multiple departments (Composition relationship)
class Company {
    private String name; // Company name
    private ArrayList<Department> departments; // List of departments in the company

    // Constructor to initialize company with a name
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>(); // Initialize the list of departments
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display all employees in the company
    public void displayEmployees() {
        System.out.println("Employees in " + name + ":");
        for (Department department : departments) {
            department.displayEmployees(); // Display employees in each department
        }
        System.out.println();
    }
}

// Department class representing a department with employees
class Department {
    private String name; // Department name
    private ArrayList<Employee> employees; // List of employees in the department

    // Constructor to initialize department with a name
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>(); // Initialize the list of employees
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in " + name + ":");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
        System.out.println();
    }
}

// Employee class representing an individual employee
class Employee {
    private String name; // Employee name

    // Constructor to initialize employee with a name
    public Employee(String name) {
        this.name = name;
    }

    // Getter method to retrieve the employee's name
    public String getName() {
        return name;
    }
}



// Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
// Tasks:
// Define a Company class that contains multiple Department objects.
// Define an Employee class within each Department.
// Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
// Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.