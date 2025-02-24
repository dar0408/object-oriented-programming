// Program to Handle Mobile Phone Details
// Problem Statement: Create a MobilePhone class with attributes brand, model, and price. 
// Add a method to display all the details of the phone. 

// Class representing a Mobile Phone with brand, model, and price attributes
class MobilePhone {
    String brand;  // Variable to store the brand of the phone
    String model;  // Variable to store the model of the phone
    double price;  // Variable to store the price of the phone

    // Constructor to initialize mobile phone details
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;   // Assigning parameter value to instance variable
        this.model = model;   // Assigning parameter value to instance variable
        this.price = price;   // Assigning parameter value to instance variable
    }

    // Method to display mobile phone details
    public void display() {
        System.out.println("Brand: " + brand);   // Printing brand name
        System.out.println("Model: " + model);   // Printing model name
        System.out.println("Price: " + price);   // Printing price
    }
}

// Main class to demonstrate the MobilePhone class functionality
public class MobileDetail {
    public static void main(String[] args) {
        // Creating mobile phone objects with brand, model, and price
        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S21", 70000);
        MobilePhone m2 = new MobilePhone("Apple", "iPhone 12", 80000);

        // Displaying details of the mobile phones
        m1.display();
        m2.display();
    }
}
