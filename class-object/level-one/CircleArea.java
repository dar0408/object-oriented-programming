// Program to Compute Area of a Circle
// Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.


// Class representing a Circle with a radius attribute
class Circle {
    double radius;  // Variable to store the radius of the circle

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius; // Assigning parameter value to instance variable
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius; // Formula: π * r²
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius; // Formula: 2 * π * r
    }

    // Method to display circle details
    public void display() {
        System.out.println("Radius: " + radius);               // Printing radius
        System.out.println("Area: " + area());                 // Printing calculated area
        System.out.println("Circumference: " + circumference()); // Printing calculated circumference
    }
}

// Main class to demonstrate the Circle class functionality
public class CircleArea {
    public static void main(String[] args) {
        // Creating circle objects with different radii
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);

        // Displaying details of the circles
        c1.display();
        c2.display();
    }
}
