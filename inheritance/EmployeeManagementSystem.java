// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.



// Base Employee class
class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}

// Manager subclass extending Employee
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overridden display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

    // Method to update team size
    public void updateTeamSize(int newSize) {
        this.teamSize = newSize;
        System.out.println("Team size updated to: " + newSize);
    }
}

// Developer subclass extending Employee
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Intern subclass extending Employee
class Intern extends Employee {
    private String project;

    public Intern(String name, int id, double salary, String project) {
        super(name, id, salary);
        this.project = project;
    }

    // Overridden display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Project: " + project);
    }

    // Method to update project
    public void updateProject(String newProject) {
        this.project = newProject;
        System.out.println("Intern's project updated to: " + newProject);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("John", 101, 50000, 10),
            new Developer("Alice", 102, 60000, "Java"),
            new Intern("Bob", 103, 30000, "Web Development")
        };

        // Display details of all employees
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("----------------------");
        }

        // Demonstrating additional functionalities
        System.out.println("\nUpdating Team Size and Project...\n");
        ((Manager) employees[0]).updateTeamSize(12);
        ((Intern) employees[2]).updateProject("AI Research");
    }
}
