// Problem 3: Vehicle Registration
// Create a Vehicle class to manage the details of vehicles:
// Instance Variables: ownerName, vehicleType.
// Class Variable: registrationFee (fixed for all vehicles).
// Methods:
// An instance method displayVehicleDetails() to display owner and vehicle details.
// A class method updateRegistrationFee() to change the registration fee.

public class VehicleRegistration {
    public static void main(String[] args) {
        // Creating multiple Vehicle objects with different owners and vehicle types
        Vehicle vehicle1 = new Vehicle("John", "Car");
        Vehicle vehicle2 = new Vehicle("Smith", "Bike");
        Vehicle vehicle3 = new Vehicle("David", "Truck");
        Vehicle vehicle4 = new Vehicle("Miller", "Bus");
        Vehicle vehicle5 = new Vehicle("Wilson", "Van");

        // Displaying vehicle details for each instance
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
        vehicle4.displayVehicleDetails();
        vehicle5.displayVehicleDetails();

        // Updating the registration fee for all vehicles using the class method
        Vehicle.updateRegistrationFee(100);
    }
}

// Vehicle class to store vehicle details
class Vehicle {
    String ownerName;  // Instance variable to store owner's name
    String vehicleType;  // Instance variable to store the type of vehicle
    static int registrationFee = 50;  // Static variable shared by all vehicle instances

    // Constructor to initialize owner name and vehicle type
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Static method to update the registration fee for all vehicles
    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }
}
