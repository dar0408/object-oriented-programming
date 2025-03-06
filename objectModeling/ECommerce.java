// Problem 4: E-commerce Platform with Orders, Customers, and Products
// Description: Design an e-commerce platform with Order, Customer, and Product classes. 
// Model relationships where a Customer places an Order, and each Order contains multiple Product objects.
// Goal: Show communication and object relationships by designing a system where customers communicate through orders, and orders aggregate products.

import java.util.ArrayList;

// Platform class representing the e-commerce system
class Platform {
    private ArrayList<Order> orders; // List of orders placed in the platform
    private ArrayList<Customer> customers; // List of registered customers
    private ArrayList<Product> products; // List of available products

    // Constructor to initialize the platform with empty lists
    public Platform() {
        this.orders = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    // Method to add an order to the platform
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Method to add a customer to the platform
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to add a product to the platform
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display all orders and their associated products
    public void displayOrders() {
        System.out.println("Orders in the platform:");
        for (Order order : orders) {
            order.displayProducts();
        }
    }
}

// Order class representing a customer's order
class Order {
    private ArrayList<Product> products; // List of products in the order
    private Customer customer; // Customer who placed the order

    // Constructor to initialize an order for a specific customer
    public Order(Customer customer) {
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display all products in the order
    public void displayProducts() {
        System.out.println("Products in the order:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println();
    }
}

// Customer class representing a user who can place orders
class Customer {
    private String name; // Customer's name
    private ArrayList<Order> orders; // List of orders placed by the customer

    // Constructor to initialize a customer with a name
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method for the customer to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Getter method to retrieve the customer's name
    public String getName() {
        return name;
    }
}

// Product class representing an individual product
class Product {
    private String name; // Product name

    // Constructor to initialize a product with a name
    public Product(String name) {
        this.name = name;
    }

    // Getter method to retrieve the product's name
    public String getName() {
        return name;
    }
}

// Main class to simulate the e-commerce platform
public class ECommerce {
    public static void main(String[] args) {
        // Create an instance of the platform
        Platform platform = new Platform();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create products
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Phone");
        Product product3 = new Product("Tablet");

        // Create orders for customers
        Order order1 = new Order(customer1);
        Order order2 = new Order(customer2);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product2);
        order2.addProduct(product3);

        // Customers place their orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Add orders, customers, and products to the platform
        platform.addOrder(order1);
        platform.addOrder(order2);
        platform.addCustomer(customer1);
        platform.addCustomer(customer2);
        platform.addProduct(product1);
        platform.addProduct(product2);
        platform.addProduct(product3);

        // Display all orders on the platform
        platform.displayOrders();
    }
}
