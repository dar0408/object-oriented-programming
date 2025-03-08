// Smart Home Devices
// Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
// Tasks:
// Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.
// Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.


// Base class representing a Device
class Device {
    int deviceId; // Unique identifier for the device
    String status; // The current status of the device (e.g., "On", "Off")

    // Constructor to initialize device details
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the status of the device
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId); // Display device ID
        System.out.println("Status: " + status); // Display device status
    }
}

// Subclass representing a Thermostat, extending the Device class
class Thermostat extends Device {
    int temperatureSetting; // Temperature setting of the thermostat

    // Constructor to initialize thermostat details, calling parent class constructor
    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Calling the parent constructor to initialize deviceId and status
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus to include the temperature setting of the thermostat
    @Override
    public void displayStatus() {
        super.displayStatus(); // Calling the parent class displayStatus to display device details
        System.out.println("Temperature Setting: " + temperatureSetting); // Display the thermostat's temperature setting
    }
}

// Main class simulating a smart home system
public class SmartHome {
    public static void main(String[] args) {
        // Creating instances for devices and thermostats
        Device device1 = new Device(1, "On");
        Thermostat thermostat1 = new Thermostat(2, "Off", 72);

        Device device2 = new Device(3, "On");
        Thermostat thermostat2 = new Thermostat(4, "Off", 68);

        // Storing devices and thermostats in arrays for iteration
        Device[] devices = {device1, device2};
        Thermostat[] thermostats = {thermostat1, thermostat2};

        // Loop through each device and thermostat, and display their status
        for (int i = 0; i < devices.length; i++) {
            devices[i].displayStatus(); // Display the status of the device
            thermostats[i].displayStatus(); // Display the status of the thermostat
            System.out.println(); // Add a blank line between outputs
        }
    }
}
