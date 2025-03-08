// Ride-Hailing Application
// Description: Develop a ride-hailing application:
// Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
// Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
// Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
// Use an interface GPS with methods getCurrentLocation() and updateLocation().
// Secure driver and vehicle details using encapsulation.
// Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.

import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
// Fields: vehicleId, driverName, and ratePerKm (private for encapsulation)
// Abstract method calculateFare(double distance) to be implemented by subclasses
// Concrete method getVehicleDetails() to print vehicle details
abstract class Vehicle {
    private int vehicleId; // Vehicle ID
    private String driverName; // Driver Name
    private double ratePerKm; // Rate per Kilometer

    // Constructor to initialize vehicle details
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method for calculating fare, to be implemented by subclasses
    public abstract double calculateFare(double distance);

    // Concrete method for displaying vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId); // Print vehicle ID
        System.out.println("Driver Name: " + driverName); // Print driver name
        System.out.println("Rate per Kilometer: " + ratePerKm); // Print rate per kilometer
    }

    // Getter and Setter methods for encapsulation
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

// Car is a subclass of Vehicle
// Implements calculateFare method to calculate the fare for a Car
class Car extends Vehicle {
    // Constructor to initialize car details
    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing calculateFare method for Car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Use getter for encapsulation
    }
}

// Bike is a subclass of Vehicle
// Implements calculateFare method to calculate the fare for a Bike
class Bike extends Vehicle {
    // Constructor to initialize bike details
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing calculateFare method for Bike
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Use getter for encapsulation
    }
}

// Auto is a subclass of Vehicle
// Implements calculateFare method to calculate the fare for an Auto
class Auto extends Vehicle {
    // Constructor to initialize auto details
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing calculateFare method for Auto
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Use getter for encapsulation
    }
}

// Interface GPS
// Methods: getCurrentLocation() and updateLocation()
// This interface can be implemented by Vehicle subclasses if needed for GPS functionality
interface GPS {
    // Abstract method to get current location
    String getCurrentLocation();

    // Abstract method to update location
    void updateLocation(String location);
}

// Main class RideHandling
public class RideHandling {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add vehicles to the list (Car, Bike, Auto)
        vehicles.add(new Car(101, "John", 10.5)); // Adding a Car with rate per km
        vehicles.add(new Bike(102, "Alice", 5.0)); // Adding a Bike with rate per km
        vehicles.add(new Auto(103, "Bob", 8.0)); // Adding an Auto with rate per km

        // Calculate fare for each vehicle for a given distance (15.5 km)
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails(); // Display vehicle details
            double fare = vehicle.calculateFare(15.5); // Calculate fare for 15.5 km
            System.out.println("Fare: $" + fare); // Display calculated fare
            System.out.println(); // Print a blank line to separate vehicle details
        }
    }
}
