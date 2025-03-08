// Online Food Delivery System
// Description: Create an online food delivery system:
// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.


import java.util.ArrayList;
import java.util.List;

// Abstract class FoodItem
// Fields: itemName, price, and quantity (private for encapsulation)
// Abstract method calculateTotalPrice() to be implemented by subclasses
// Concrete method getItemDetails() to print item details

abstract class FoodItem {
    private String itemName; // Item Name
    private double price; // Item Price
    private int quantity; // Item Quantity

    // Constructor to initialize item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method for calculating total price, to be implemented by subclasses
    public abstract double calculateTotalPrice();

    // Concrete method for displaying item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName); // Print item name
        System.out.println("Price: " + price); // Print item price
        System.out.println("Quantity: " + quantity); // Print item quantity
    }

    // Getter and Setter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// VegItem is a subclass of FoodItem
// Implements the calculateTotalPrice() method for calculating total price of veg items
class VegItem extends FoodItem {
    // Constructor to initialize veg item details
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Override calculateTotalPrice() method to calculate total price of veg items
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // Total price of veg item = price * quantity
    }
}

// NonVegItem is a subclass of FoodItem
// Implements the calculateTotalPrice() method for calculating total price of non-veg items
class NonVegItem extends FoodItem {
    // Additional charge for non-veg items
    private double additionalCharge;

    // Constructor to initialize non-veg item details
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge; // Initialize additional charge
    }

    // Override calculateTotalPrice() method to calculate total price of non-veg items
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + additionalCharge; // Total price of non-veg item = price * quantity + additional charge
    }
}

// Interface Discountable
// Methods: applyDiscount() and getDiscountDetails()
interface Discountable {
    void applyDiscount(); // Apply discount
    void getDiscountDetails(); // Get discount details
}

// Order class to process food orders
class Order {
    private List<FoodItem> items; // List of food items in the order

    // Constructor to initialize order items
    public Order() {
        items = new ArrayList<>(); // Initialize list of food items
    }

    // Method to add food items to the order
    public void addFoodItem(FoodItem item) {
        items.add(item); // Add food item to the order
    }

    // Method to process the order and calculate total price
    public double processOrder() {
        double totalPrice = 0; // Initialize total price

        // Iterate through each food item in the order
        for (FoodItem item : items) {
            totalPrice += item.calculateTotalPrice(); // Calculate total price for each item
        }

        return totalPrice; // Return total price of the order
    }
}

// Main class to demonstrate online food delivery system
public class FoodDelivery {
    public static void main(String[] args) {
        // Create an order for food items
        Order order = new Order();

        // Add veg items to the order
        FoodItem vegItem1 = new VegItem("Veg Burger", 5.99, 2);
        FoodItem vegItem2 = new VegItem("Veg Pizza", 8.99, 1);
        order.addFoodItem(vegItem1);
        order.addFoodItem(vegItem2);

        // Add non-veg items to the order
        FoodItem nonVegItem = new NonVegItem("Chicken Wings", 10.99, 1, 2.0);
        order.addFoodItem(nonVegItem);

        // Process the order and calculate total price
        double totalPrice = order.processOrder();
        System.out.println("Total Price: $" + totalPrice);
    }
}

