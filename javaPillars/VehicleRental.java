// Vehicle Rental System
// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.


import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
// Fields: vehicleNumber, type, and rentalRate (private for encapsulation)
// Abstract method calculateRentalCost(int days) to be implemented by subclasses
// Concrete method displayDetails() to print vehicle details
abstract class Vehicle {
    private int vehicleNumber; // Vehicle Number
    private String type; // Vehicle Type
    private double rentalRate; // Rental Rate

    // Constructor to initialize vehicle details
    public Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method for calculating rental cost, to be implemented by subclasses
    public abstract double calculateRentalCost(int days);

    // Concrete method for displaying vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber); // Print vehicle number
        System.out.println("Type: " + type); // Print vehicle type
        System.out.println("Rental Rate: " + rentalRate); // Print rental rate
    }

    // Getter and Setter methods for encapsulation
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

// Car is a subclass of Vehicle
class Car extends Vehicle {
    // Constructor to initialize car details
    public Car(int vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Implementation of calculateRentalCost for Car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Calculate rental cost for car
    }
}

// Bike is a subclass of Vehicle
class Bike extends Vehicle {
    // Constructor to initialize bike details
    public Bike(int vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Implementation of calculateRentalCost for Bike
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Calculate rental cost for bike
    }
}

// Truck is a subclass of Vehicle
class Truck extends Vehicle {
    // Constructor to initialize truck details
    public Truck(int vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Implementation of calculateRentalCost for Truck
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Calculate rental cost for truck
    }
}

// Interface Insurable
// Methods: calculateInsurance() and getInsuranceDetails()      

interface Insurable {
    double calculateInsurance(); // Calculate insurance cost based on vehicle type
    String getInsuranceDetails(); // Get insurance details for the vehicle
}

// VehicleRental class to manage vehicle rentals
public class VehicleRental {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(101, "Sedan", 50.0)); // Add a car to the list
        vehicles.add(new Bike(201, "Motorcycle", 20.0)); // Add a bike to the list
        vehicles.add(new Truck(301, "Pickup", 100.0)); // Add a truck to the list

        // Iterate over the list of vehicles
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(); // Display vehicle details
            double rentalCost = vehicle.calculateRentalCost(5); // Calculate rental cost for 5 days
            System.out.println("Rental Cost: " + rentalCost); // Print rental cost

            // Check if the vehicle is insurable
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle; // Cast to Insurable interface
                double insuranceCost = insurableVehicle.calculateInsurance(); // Calculate insurance cost
                System.out.println("Insurance Cost: " + insuranceCost); // Print insurance cost
                System.out.println("Insurance Details: " + insurableVehicle.getInsuranceDetails()); // Print insurance details
            }
            System.out.println(); // Print a blank line for separation
        }
    }
}

