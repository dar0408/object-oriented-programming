// Problem 4: Employee Records


public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee1 = new Employee(101, "John Doe", 50000.0);

        // Modify salary using public method
        employee1.setSalary(60000.0);

        // Create a Manager object and display details
        Manager manager1 = new Manager(102, "Alice Smith", 70000.0, "HR");
        manager1.displayManagerDetails();
    }
}

class Employee {
    public int employeeID;  // public field
    protected String department;  // protected field
    private double salary;    // private field

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter and Setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {

    // Constructor
    public Manager(int employeeID, String department, double salary, String departmentName) {
        super(employeeID, department, salary);
        this.department = departmentName;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Salary: " + getSalary()); // Using public method to access private salary
    }
}





// Develop an Employee class with:
// employeeID (public).
// department (protected).
// salary (private).
// Write methods to:
// Modify salary using a public method.
// Create a subclass Manager to access employeeID and department.

