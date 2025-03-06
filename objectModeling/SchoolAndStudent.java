import java.util.ArrayList;

// Main class to run the program
public class SchoolAndStudent {
    public static void main(String[] args) {
        // Create a School object
        School school = new School("School A");

        // Create Student objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        // Create Course objects
        Course course1 = new Course("Course 1");
        Course course2 = new Course("Course 2");

        // Enroll students in courses
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);
        student3.enroll(course2);

        // Add students to school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Display courses for each student in the school
        school.displayCourses();
    }
}

// Class representing a school
class School {
    private String name; // Name of the school
    private ArrayList<Student> students; // List of students in the school

    // Constructor to initialize the school with a name
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display the courses each student is enrolled in
    public void displayCourses() {
        System.out.println("Courses for students in " + name + ":");
        for (Student student : students) {
            student.displayCourses();
        }
        System.out.println();
    }
}

// Class representing a student
class Student {
    private String name; // Name of the student
    private ArrayList<Course> courses; // List of courses the student is enrolled in

    // Constructor to initialize the student with a name
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll the student in a course
    public void enroll(Course course) {
        courses.add(course);
    }

    // Method to display all courses the student is enrolled in
    public void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();
    }
}

// Class representing a course
class Course {
    private String name; // Name of the course

    // Constructor to initialize the course with a name
    public Course(String name) {
        this.name = name;
    }

    // Method to get the name of the course
    public String getName() {
        return name;
    }
}




// Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
// Tasks:
// Define School, Student, and Course classes.
// Model an association between Student and Course to show that students can enroll in multiple courses.
// Model an aggregation relationship between School and Student.
// Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
// Goal: Practice association by modeling many-to-many relationships between students and courses.
