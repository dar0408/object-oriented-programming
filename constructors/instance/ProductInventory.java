// Problem 1: Product Inventory
// Create a Product class with:
// Instance Variables: productName, price.
// Class Variable: totalProducts (shared among all products).
// Methods:
// An instance method displayProductDetails() to display the details of a product.
// A class method displayTotalProducts() to show the total number of products created.

public class ProductInventory {
    public static void main(String[] args) {
        // Creating multiple Product objects with different names and prices
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Mobile", 500);
        Product product3 = new Product("Tablet", 300);
        Product product4 = new Product("Smart Watch", 200);
        Product product5 = new Product("Headphones", 100);

        // Displaying details of each product
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        product4.displayProductDetails();
        product5.displayProductDetails();

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}

// Product class to store product details
class Product {
    String productName;  // Instance variable to store the product name
    int price;  // Instance variable to store the product price
    static int totalProducts = 0;  // Static variable to keep track of the total number of products

    // Constructor to initialize product details and increment the total product count
    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total products each time a new product is created
    }

    // Method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Static method to display the total number of products created
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
