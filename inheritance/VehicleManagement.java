// Vehicle Management System with Hybrid Inheritance
// Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// Tasks:
// Define a superclass Vehicle with attributes like maxSpeed and model.
// Create an interface Refuelable with a method refuel().
// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
// Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
// Base class for Vehicle with common properties


class Vehicle {
    int maxSpeed;  // Maximum speed of the vehicle
    String model;  // Model of the vehicle

    // Constructor to initialize maxSpeed and model
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// Interface for vehicles that require refueling
interface Refuelable {
    // Method to be implemented by classes that can be refueled
    void refuel();
}

// ElectricVehicle class extending Vehicle, as it is a type of vehicle
class ElectricVehicle extends Vehicle {
    // Constructor to initialize ElectricVehicle with maxSpeed and model
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);  // Call the parent constructor to initialize common properties
    }

    // Method to simulate charging an electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle");
    }
}

// PetrolVehicle class extending Vehicle and implementing Refuelable interface
class PetrolVehicle extends Vehicle implements Refuelable {
    // Constructor to initialize PetrolVehicle with maxSpeed and model
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);  // Call the parent constructor to initialize common properties
    }

    // Implementation of the refuel method from the Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle");
    }
}

// Main class to manage and demonstrate the functionality of vehicles
public class VehicleManagement {
    public static void main(String[] args) {
        // Create an ElectricVehicle object with speed 150 and model "Tesla Model S"
        ElectricVehicle electricCar = new ElectricVehicle(150, "Tesla Model S");
        
        // Create a PetrolVehicle object with speed 200 and model "Toyota Corolla"
        PetrolVehicle petrolCar = new PetrolVehicle(200, "Toyota Corolla");

        // Demonstrate the charging of the electric car
        electricCar.charge();
        
        // Demonstrate the refueling of the petrol car
        petrolCar.refuel();
    }
}

