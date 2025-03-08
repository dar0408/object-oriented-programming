// Online Retail Order Management
// Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:
// Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.
// Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
// Base class representing an Order
class Order {
    int orderId; // Unique order ID
    String orderDate; // Date when the order was placed

    // Constructor to initialize order details
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the current order status
    public String getOrderStatus() {
        return "Order Placed"; // Default status for an order
    }
}

// Subclass representing a shipped order, extending the Order class
class ShippedOrder extends Order {
    String trackingNumber; // Tracking number for the shipment

    // Constructor to initialize shipped order details
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling parent class constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus method to indicate shipment status
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass representing a delivered order, extending the ShippedOrder class
class DeliveredOrder extends ShippedOrder {
    String deliveryDate; // Date when the order was delivered

    // Constructor to initialize delivered order details
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Calling parent class constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus method to indicate delivery status
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}

// Main class to simulate order processing
public class RetailOrder {
    public static void main(String[] args) {
        // Creating different types of orders
        Order order1 = new Order(1, "2021-01-01"); // Order placed
        ShippedOrder order2 = new ShippedOrder(2, "2021-01-02", "123456"); // Order shipped
        DeliveredOrder order3 = new DeliveredOrder(3, "2021-01-03", "789012", "2021-01-05"); // Order delivered

        // Storing orders in an array
        Order[] orders = {order1, order2, order3};

        // Looping through orders and displaying their details
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId);
            System.out.println("Order Date: " + order.orderDate);
            System.out.println("Order Status: " + order.getOrderStatus()); // Calls the overridden method dynamically
            System.out.println();
        }
    }
}
