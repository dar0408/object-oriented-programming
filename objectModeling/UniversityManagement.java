// Problem 5: University Management System
// Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
// Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.

import java.util.ArrayList;

class UniversityManagement {
    public static void main(String[] args) {
        // Creating a university instance
        University university = new University("Stanford University");
        
        // Creating departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Creating faculty members
        Faculty csFaculty1 = new Faculty("John Doe");
        Faculty csFaculty2 = new Faculty("Jane Smith");
        Faculty mathFaculty1 = new Faculty("Alice Johnson");

        // Creating courses
        Course csCourse1 = new Course("CS101");
        Course csCourse2 = new Course("CS201");
        Course mathCourse1 = new Course("MATH101");

        // Adding departments to university
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Adding faculty members to departments
        csDepartment.addFaculty(csFaculty1);
        csDepartment.addFaculty(csFaculty2);
        mathDepartment.addFaculty(mathFaculty1);

        // Assigning courses to faculties
        csFaculty1.addCourse(csCourse1);
        csFaculty2.addCourse(csCourse2);
        mathFaculty1.addCourse(mathCourse1);

        // Creating student instances
        Student student1 = new Student("Alice Brown");
        Student student2 = new Student("Bob Green");

        // Enrolling students in courses
        student1.enrollCourse(csCourse1);
        student1.enrollCourse(mathCourse1);
        student2.enrollCourse(csCourse2);

        // Displaying university structure
        university.displayDepartments();
        
        // Displaying courses for each student
        student1.displayCourses();
        student2.displayCourses();
    }
}

// University class representing the university structure
class University {
    private String name;
    private ArrayList<Department> departments;

    // Constructor to initialize the university with its name
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display departments in the university
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            department.displayFaculties(); // Displaying faculties within each department
        }
        System.out.println();
    }
}

// Department class representing a department in the university
class Department {
    private String name;
    private ArrayList<Faculty> faculties;

    // Constructor to initialize the department with its name
    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display faculties in the department
    public void displayFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty faculty : faculties) {
            faculty.displayCourses(); // Displaying courses taught by each faculty
        }
        System.out.println();
    }
}

// Faculty class representing a faculty member in the department
class Faculty {
    private String name;
    private ArrayList<Course> courses;

    // Constructor to initialize the faculty with their name
    public Faculty(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to add a course taught by the faculty
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method to display courses taught by the faculty
    public void displayCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getName()); // Displaying the course name
        }
        System.out.println();
    }
}

// Course class representing a course in the university
class Course {
    private String name;

    // Constructor to initialize the course with its name
    public Course(String name) {
        this.name = name;
    }

    // Getter method to get the course name
    public String getName() {
        return name;
    }
}

// Student class representing a student in the university
class Student {
    private String name;
    private ArrayList<Course> courses;

    // Constructor to initialize the student with their name
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method for a student to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
    }

    // Method to display courses in which the student is enrolled
    public void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getName()); // Displaying the course name
        }
        System.out.println();
    }
}
