// Problem 2: Bank and Account Holders (Association)

import java.util.ArrayList;

public class Association {
    public static void main(String[] args) {
        // Create a Bank object
        Bank bank = new Bank("Bank of America");

        // Create Customer objects
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank.openAccount(customer1);
        bank.openAccount(customer2);

        // Display account holders in the bank
        bank.displayAccountHolders();
    }
}

// Bank class representing a bank with a list of account holders (Association relationship)
class Bank {
    private String name; // Bank name
    private ArrayList<Customer> accountHolders; // List of customers associated with the bank

    // Constructor to initialize bank with a name
    public Bank(String name) {
        this.name = name;
        this.accountHolders = new ArrayList<>(); // Initialize the list of account holders
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer) {
        accountHolders.add(customer);
    }

    // Method to display all account holders in the bank
    public void displayAccountHolders() {
        System.out.println("Account holders in " + name + ":");
        for (Customer customer : accountHolders) {
            System.out.println(customer.getName());
        }
        System.out.println();
    }
}

// Customer class representing a bank customer
class Customer {
    private String name; // Customer name

    // Constructor to initialize customer with a name
    public Customer(String name) {
        this.name = name;
    }

    // Getter method to retrieve the customer's name
    public String getName() {
        return name;
    }
}



// Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
// Tasks:
// Define a Bank class and a Customer class.
// Use an association relationship to show that each customer has an account in a bank.
// Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
// Goal: Illustrate association by setting up a relationship between customers and the bank.
