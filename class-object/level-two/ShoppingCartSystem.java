// Program to Simulate a Shopping Cart
// Problem Statement: Create a ShoppingCart class with attributes itemName, price, and quantity. 
// - Add methods to add an item, remove an item, and display the total cost. 
import java.util.ArrayList;

// CartItem class to represent each item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize CartItem attributes
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost for this item
    public double totalCost() {
        return price * quantity;
    }
}

// ShoppingCart class to manage cart operations
class ShoppingCart {
    ArrayList<CartItem> cartItems = new ArrayList<>();

    // Constructor to initialize the cart
    ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cartItems.add(item);
    }

    // Method to remove an item from the cart by itemName 
    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); i++) {
            CartItem item = cartItems.get(i);
            if (item.itemName.equals(itemName)) {
                cartItems.remove(i);
                System.out.println(itemName + " has been removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Items in your cart:");
        for (int i = 0; i < cartItems.size(); i++) {
            CartItem item = cartItems.get(i);
            System.out.println(item.itemName + " - Price: " + item.price + " Quantity: " + item.quantity);
        }
    }

    // Method to calculate the total cost of the cart
    public double totalCost() {
        double total = 0.0;
        for (int i = 0; i < cartItems.size(); i++) {
            CartItem item = cartItems.get(i);
            total += item.totalCost();
        }
        return total;
    }
}

// Main class to test the shopping cart functionality
public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Apple", 50.0, 3);
        cart.addItem("Bread", 30.0, 2);
        cart.addItem("Milk", 20.0, 1);

        // Displaying the cart
        cart.displayCart();

        // Showing total cost
        System.out.println("Total cost: " + cart.totalCost());

        // Removing an item from the cart
        cart.removeItem("Bread");

        // Displaying the cart after removing an item
        cart.displayCart();

        // Showing total cost after removal
        System.out.println("Total cost after removal: " + cart.totalCost());
    }
}