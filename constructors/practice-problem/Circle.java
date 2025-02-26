// Write a Circle class with a radius attribute. 
// Use constructor chaining to initialize radius with default and user-provided values.

public class Circle {
    double radius;  // Attribute to store the radius of the circle

    // Default constructor: initializes radius to 1.0 using constructor chaining
    public Circle() {
        this(1.0);  // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor: allows setting a custom radius
    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Creating Circle objects
        Circle circle1 = new Circle();  // Uses default constructor (radius = 1.0)
        Circle circle2 = new Circle(2.0);  // Uses parameterized constructor (radius = 2.0)

        // Displaying the radius of each circle
        System.out.println("Circle 1: Radius: " + circle1.radius);
        System.out.println("Circle 2: Radius: " + circle2.radius);
    }
}
