// E-Commerce Platform
// Description: Develop a simplified e-commerce platform:
// Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
// Extend it into concrete classes: Electronics, Clothing, and Groceries.
// Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
// Use encapsulation to protect product details, allowing updates only through setter methods.
// Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.



import java.util.ArrayList;
import java.util.List;

// Abstract class Product
// Fields: productId, name, and price (private for encapsulation)
// Abstract method calculateDiscount() to be implemented by subclasses
// Concrete method displayDetails() to print product details
abstract class Product {
    private int productId; // Product ID
    private String name; // Product Name
    private double price; // Product Price

    // Constructor to initialize product details
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method for calculating discount, to be implemented by subclasses
    public abstract double calculateDiscount();

    // Concrete method for displaying product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId); // Print product ID
        System.out.println("Name: " + name); // Print product name
        System.out.println("Price: " + price); // Print product price
    }

    // Getter and Setter methods for encapsulation
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Electronics is a subclass of Product
// Implements the calculateDiscount() method based on electronic category
class Electronics
        extends Product {
    // Constructor to initialize electronics details
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Override calculateDiscount() method for electronics category
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount for electronics
    }
}   

// Clothing is a subclass of Product
// Implements the calculateDiscount() method based on clothing category
class Clothing
        extends Product {
    // Constructor to initialize clothing details
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Override calculateDiscount() method for clothing category
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount for clothing
    }
}

// Groceries is a subclass of Product
// Implements the calculateDiscount() method based on groceries category
class Groceries
        extends Product {
    // Constructor to initialize groceries details
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Override calculateDiscount() method for groceries category
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount for groceries
    }
}

// Interface Taxable
// Methods: calculateTax() and getTaxDetails() for applicable product categories
interface Taxable {
    double calculateTax(); // Calculate tax based on product category
    String getTaxDetails(); // Get tax details for product category
}

// E-Commerce Platform
public class eCommers {
    // Method to calculate and print final price (price + tax - discount) for a list of products
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount(); // Calculate discount
            double tax = 0; // Initialize tax
            if (product instanceof Taxable) { // Check if product is taxable
                Taxable taxableProduct = (Taxable) product; // Downcast to Taxable
                tax = taxableProduct.calculateTax(); // Calculate tax
            }
            double finalPrice = product.getPrice() + tax - discount; // Calculate final price
            System.out.println("Product: " + product.getName()); // Print product name
            System.out.println("Final Price: " + finalPrice); // Print final price
        }
    }

    public static void main(String[] args) {
        // Create a list of products (electronics, clothing, and groceries)
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Smartphone", 500)); // Add electronics product
        products.add(new Clothing(201, "T-Shirt", 20)); // Add clothing product
        products.add(new Groceries(301, "Bread", 2)); // Add groceries product

        // Calculate and print final price for each product
        calculateFinalPrice(products);
    }
}

