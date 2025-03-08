// Educational Course Hierarchy
// Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
// Tasks:
// Define a superclass Course with attributes like courseName and duration.
// Define OnlineCourse to add attributes such as platform and isRecorded.
// Define PaidOnlineCourse to add fee and discount.
// Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.

// Base class representing a generic course
class Course {
    String courseName; // Name of the course
    int duration; // Duration of the course in weeks

    // Constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass representing an online course, inheriting from Course
class OnlineCourse extends Course {
    String platform; // Platform where the course is available (e.g., Udemy, Coursera)
    boolean isRecorded; // Indicates if the course is recorded or live

    // Constructor to initialize online course details
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Calling the superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseInfo() to include online course-specific details
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Calling the base class method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass representing a paid online course, inheriting from OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee; // Course fee
    double discount; // Discount percentage on the fee

    // Constructor to initialize paid online course details
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Calling the superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayCourseInfo() to include paid course-specific details
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Calling the base class method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Main class to demonstrate different types of courses
public class EducationalCourse {
    public static void main(String[] args) {
        // Creating instances of different types of courses
        Course course1 = new Course("Java Programming", 8);
        OnlineCourse onlineCourse1 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paidCourse1 = new PaidOnlineCourse("Java Programming", 8, "Udemy", true, 99.99, 20);

        Course course2 = new Course("Python Basics", 6);
        OnlineCourse onlineCourse2 = new OnlineCourse("Python Basics", 6, "Coursera", false);
        PaidOnlineCourse paidCourse2 = new PaidOnlineCourse("Python Basics", 6, "Coursera", false, 49.99, 10);

        // Storing courses in separate arrays for iteration
        Course[] courses = {course1, course2};
        OnlineCourse[] onlineCourses = {onlineCourse1, onlineCourse2};
        PaidOnlineCourse[] paidCourses = {paidCourse1, paidCourse2};

        // Looping through each set of courses and displaying details
        for (int i = 0; i < courses.length; i++) {
            courses[i].displayCourseInfo();
            onlineCourses[i].displayCourseInfo();
            paidCourses[i].displayCourseInfo();
            System.out.println();
        }
    }
}
