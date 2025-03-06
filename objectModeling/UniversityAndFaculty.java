import java.util.ArrayList;

// Main class to run the program
public class UniversityAndFaculty {
    public static void main(String[] args) {
        // Create a University object
        University university = new University("University A");

        // Create Department objects
        Department department1 = new Department("Department 1");
        Department department2 = new Department("Department 2");

        // Create Faculty objects
        Faculty faculty1 = new Faculty("Alice");
        Faculty faculty2 = new Faculty("Bob");
        Faculty faculty3 = new Faculty("Charlie");

        // Add faculty members to departments
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        // Add departments to university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Display faculties in the university
        university.displayFaculties();
    }
}

// Class representing a University
class University {
    private String name; // Name of the university
    private ArrayList<Department> departments; // List of departments in the university

    // Constructor to initialize the university with a name
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display faculties of all departments in the university
    public void displayFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Department department : departments) {
            department.displayFaculties();
        }
        System.out.println();
    }
}

// Class representing a Department
class Department {
    private String name; // Name of the department
    private ArrayList<Faculty> faculties; // List of faculty members in the department

    // Constructor to initialize the department with a name
    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display faculty members of the department
    public void displayFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println(faculty.getName());
        }
        System.out.println();
    }
}

// Class representing a Faculty member
class Faculty {
    private String name; // Name of the faculty member

    // Constructor to initialize the faculty with a name
    public Faculty(String name) {
        this.name = name;
    }

    // Method to get the name of the faculty member
    public String getName() {
        return name;
    }
}


// Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
// Tasks:
// Define a University class with Department and Faculty classes.
// Demonstrate how deleting a University also deletes its Departments.
// Show that Faculty members can exist independently of a Department.
// Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.
