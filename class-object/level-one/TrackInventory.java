// Program to Track Inventory of Items
// Problem Statement: Create an Item class with attributes itemCode, itemName, and price. 
// Add a method to display item details and calculate the total cost for a given quantity.

// Class representing an Item with itemCode, itemName, and price attributes
class Item {
    int itemCode;    // Variable to store the item code
    String itemName; // Variable to store the item name
    double price;    // Variable to store the item price

    // Constructor to initialize item details
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;   // Assigning parameter value to instance variable
        this.itemName = itemName;   // Assigning parameter value to instance variable
        this.price = price;         // Assigning parameter value to instance variable
    }

    // Method to display item details
    public void display() {
        System.out.println("Item Code: " + itemCode); // Printing item code
        System.out.println("Item Name: " + itemName); // Printing item name
        System.out.println("Price: " + price);        // Printing item price
    }

    // Method to calculate total cost for a given quantity
    public double calculateCost(int quantity) {
        return this.price * quantity; // Total cost = price * quantity
    }
}

// Main class to demonstrate the Item class functionality
public class TrackInventory {
    public static void main(String[] args) {
        // Creating item objects with item code, name, and price
        Item i1 = new Item(101, "Laptop", 45000);
        Item i2 = new Item(102, "Mobile", 25000);

        // Displaying item details and calculating total cost for given quantities
        i1.display();
        System.out.println("Total Cost for 5 Laptops: " + i1.calculateCost(5));

        i2.display();
        System.out.println("Total Cost for 10 Mobiles: " + i2.calculateCost(10));
    }
}
