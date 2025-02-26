// Design a Course class with:
// Instance Variables: courseName, duration, fee.
// Class Variable: instituteName (common for all courses).
// Methods:
// An instance method displayCourseDetails() to display the course details.
// A class method updateInstituteName() to modify the institute name for all courses.

public class CourseManagement {
    public static void main(String[] args) {
        // Creating multiple Course objects with different course details
        Course course1 = new Course("Java", 3, 500);
        Course course2 = new Course("Python", 2, 300);
        Course course3 = new Course("JavaScript", 1, 200);
        Course course4 = new Course("C++", 2, 400);
        Course course5 = new Course("Ruby", 1, 100);

        // Displaying the details of each course
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
        course4.displayCourseDetails();
        course5.displayCourseDetails();

        // Updating the institute name for all courses using the class method
        Course.updateInstituteName("ABC Institute");
    }
}

// Course class to store and manage course details
class Course {
    String courseName;  // Instance variable to store the name of the course
    int duration;  // Instance variable to store the duration of the course in months
    int fee;  // Instance variable to store the fee of the course
    static String instituteName;  // Static variable shared among all Course instances (institute name)

    // Constructor to initialize course details (course name, duration, and fee)
    Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);  // Displaying the shared institute name
    }

    // Static method to update the institute name for all courses
    static void updateInstituteName(String name) {
        instituteName = name;  // Updating the shared institute name
    }
}
