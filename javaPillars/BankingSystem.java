// Banking System
// Description: Create a banking system with different account types:
// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
// Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
// Use encapsulation to secure account details and restrict unauthorized access.
// Demonstrate polymorphism by processing different account types and calculating interest dynamically.


import java.util.ArrayList;
import java.util.List;

// Abstract class BankAccount
// Fields: accountNumber, holderName, and balance (private for encapsulation)
// Methods: deposit(double amount), withdraw(double amount), calculateInterest() (abstract)

abstract class BankAccount {
    private int accountNumber; // Account Number
    private String holderName; // Account Holder Name
    private double balance; // Account Balance

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount; // Add amount to balance
        System.out.println("Deposited: " + amount); // Print deposit message
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) { // Check if sufficient balance is available
            balance -= amount; // Deduct amount from balance
            System.out.println("Withdrawn: " + amount); // Print withdrawal message
        } else {
            System.out.println("Insufficient Balance"); // Print error message
        }
    }

    // Abstract method for calculating interest, to be implemented by subclasses
    public abstract double calculateInterest();

    // Getter and Setter methods for encapsulation
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// SavingsAccount is a subclass of BankAccount
// Implements the calculateInterest() method based on savings interest rate

class SavingsAccount extends BankAccount {
    private double interestRate; // Savings Interest Rate

    // Constructor to initialize savings account details
    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Override calculateInterest() method for savings account
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate; // Calculate interest based on balance and interest rate
    }
}

// CurrentAccount is a subclass of BankAccount
// Implements the calculateInterest() method based on current account interest rate

class CurrentAccount extends BankAccount {
    private double interestRate; // Current Interest Rate

    // Constructor to initialize current account details
    public CurrentAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Override calculateInterest() method for current account
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate; // Calculate interest based on balance and interest rate
    }
}

// Interface Loanable
// Methods: applyForLoan(), calculateLoanEligibility()

interface Loanable {
    void applyForLoan(); // Apply for a loan
    double calculateLoanEligibility(); // Calculate loan eligibility
}

// Main class to demonstrate banking system

public class BankingSystem {
    public static void main(String[] args) {
        // Create a list of BankAccounts
        List<BankAccount> accounts = new ArrayList<>();

        // Create a SavingsAccount and add it to the list
        SavingsAccount savingsAccount = new SavingsAccount(101, "Alice", 5000, 0.05);
        accounts.add(savingsAccount);

        // Create a CurrentAccount and add it to the list
        CurrentAccount currentAccount = new CurrentAccount(201, "Bob", 10000, 0.03);
        accounts.add(currentAccount);

        // Process each account in the list
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());

            // Deposit and withdraw operations
            account.deposit(1000);
            account.withdraw(500);

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);

            System.out.println();
        }
    }
}

