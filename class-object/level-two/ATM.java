// Program to Simulate a Simple Bank Account System
// Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. 
// Implement methods to deposit, withdraw, and display account details.

// Class representing a Bank Account with account holder, account number, and balance attributes
class BankAccount {
    String accountHolder;  // Variable to store the name of the account holder
    int accountNumber;     // Variable to store the account number
    double balance;        // Variable to store the account balance

    // Constructor to initialize bank account details
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;  // Assigning parameter value to instance variable
        this.accountNumber = accountNumber;  // Assigning parameter value to instance variable
        this.balance = balance;              // Assigning parameter value to instance variable
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        this.balance += amount;  // Adding the deposited amount to the balance
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (this.balance >= amount) {  // Checking if there are sufficient funds
            this.balance -= amount;    // Deducting the withdrawn amount from the balance
        } else {
            System.out.println("Insufficient Balance");  // Display message if balance is insufficient
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Holder: " + accountHolder); // Printing account holder's name
        System.out.println("Account Number: " + accountNumber); // Printing account number
        System.out.println("Balance: " + balance);             // Printing current balance
    }
}

// Main class to simulate banking operations
public class ATM {
    public static void main(String[] args) {
        // Creating bank account objects with account holder name, account number, and initial balance
        BankAccount b1 = new BankAccount("John", 101, 5000);
        BankAccount b2 = new BankAccount("Jane", 102, 10000);

        // Displaying initial details of the first account
        b1.display();
        
        // Depositing money into the first account
        b1.deposit(5000);
        b1.display();

        // Withdrawing money from the first account
        b1.withdraw(10000);
        b1.display();

        // Displaying initial details of the second account
        b2.display();

        // Withdrawing money from the second account
        b2.withdraw(5000);
        b2.display();

        // Depositing a large amount into the second account
        b2.deposit(327948);
        b2.display();
    }
}
