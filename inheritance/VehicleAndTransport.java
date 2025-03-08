// Vehicle and Transport System
// Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
// Tasks:
// Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
// Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.

// Base class representing a general Vehicle
class Vehicle {
    int maxSpeed; // Maximum speed of the vehicle
    String fuelType; // Type of fuel used by the vehicle (e.g., Petrol, Diesel)

    // Constructor to initialize vehicle's max speed and fuel type
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display information about the vehicle
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed); // Display max speed of the vehicle
        System.out.println("Fuel Type: " + fuelType); // Display fuel type of the vehicle
    }
}

// Subclass representing a Car, extending the Vehicle class
class Car extends Vehicle {
    int seatCapacity; // Number of seats in the car

    // Constructor to initialize car-specific details, calling parent constructor for common vehicle details
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Calling parent constructor to initialize maxSpeed and fuelType
        this.seatCapacity = seatCapacity;
    }

    // Overriding the displayInfo method to include car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the parent class's displayInfo method to display common vehicle details
        System.out.println("Seat Capacity: " + seatCapacity); // Display seat capacity of the car
    }
}

// Subclass representing a Truck, extending the Vehicle class
class Truck extends Vehicle {
    int cargoCapacity; // Maximum weight the truck can carry (cargo capacity)

    // Constructor to initialize truck-specific details, calling parent constructor for common vehicle details
    public Truck(int maxSpeed, String fuelType, int cargoCapacity) {
        super(maxSpeed, fuelType); // Calling parent constructor to initialize maxSpeed and fuelType
        this.cargoCapacity = cargoCapacity;
    }

    // Overriding the displayInfo method to include truck-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the parent class's displayInfo method to display common vehicle details
        System.out.println("Cargo Capacity: " + cargoCapacity); // Display cargo capacity of the truck
    }
}

// Subclass representing a Motorcycle, extending the Vehicle class
class Motorcycle extends Vehicle {
    String handleType; // Type of handlebar used by the motorcycle

    // Constructor to initialize motorcycle-specific details, calling parent constructor for common vehicle details
    public Motorcycle(int maxSpeed, String fuelType, String handleType) {
        super(maxSpeed, fuelType); // Calling parent constructor to initialize maxSpeed and fuelType
        this.handleType = handleType;
    }

    // Overriding the displayInfo method to include motorcycle-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the parent class's displayInfo method to display common vehicle details
        System.out.println("Handle Type: " + handleType); // Display handle type of the motorcycle
    }
}

// Main class to simulate a variety of vehicles
public class VehicleAndTransport {
    public static void main(String[] args) {
        // Creating an array of Vehicle objects
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(200, "Petrol", 5); // Creating a Car object
        vehicles[1] = new Truck(120, "Diesel", 5000); // Creating a Truck object
        vehicles[2] = new Motorcycle(180, "Petrol", "Short"); // Creating a Motorcycle object

        // Iterating over the array of vehicles and displaying their information
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo(); // Calling the displayInfo method for each vehicle
            System.out.println(); // Adding a blank line for readability between outputs
        }
    }
}
