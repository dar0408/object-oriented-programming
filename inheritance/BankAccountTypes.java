// Bank Account Types
// Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

// Base class representing a generic Bank Account
class BankAccount {
    int accountNumber; // Unique identifier for the account
    double balance; // Stores the current balance of the account

    // Constructor to initialize account number and balance
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display the type of account (can be overridden by subclasses)
    public void displayAccountType() {
        System.out.println("Account Type: Bank Account");
    }
}

// Subclass representing a Savings Account, inheriting from BankAccount
class SavingsAccount extends BankAccount {
    double interestRate; // Interest rate applicable to savings accounts

    // Constructor to initialize savings account details
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.interestRate = interestRate;
    }

    // Overriding displayAccountType() to specify Savings Account details
    @Override
    public void displayAccountType() {
        super.displayAccountType(); // Calling the base class method
        System.out.println("Account Type: Savings Account");
    }
}

// Subclass representing a Checking Account, inheriting from BankAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit; // Maximum amount that can be withdrawn at a time

    // Constructor to initialize checking account details
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding displayAccountType() to specify Checking Account details
    @Override
    public void displayAccountType() {
        super.displayAccountType(); // Calling the base class method
        System.out.println("Account Type: Checking Account");
    }
}

// Subclass representing a Fixed Deposit Account, inheriting from BankAccount
class FixedDepositAccount extends BankAccount {
    int durationMonths; // Duration for which the deposit is locked

    // Constructor to initialize fixed deposit account details
    public FixedDepositAccount(int accountNumber, double balance, int durationMonths) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.durationMonths = durationMonths;
    }

    // Overriding displayAccountType() to specify Fixed Deposit Account details
    @Override
    public void displayAccountType() {
        super.displayAccountType(); // Calling the base class method
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Main class to demonstrate different types of bank accounts
public class BankAccountTypes {
    public static void main(String[] args) {
        // Creating instances of different types of bank accounts
        BankAccount account1 = new BankAccount(1, 1000);
        SavingsAccount account2 = new SavingsAccount(2, 2000, 0.05);
        CheckingAccount account3 = new CheckingAccount(3, 3000, 500);
        FixedDepositAccount account4 = new FixedDepositAccount(4, 4000, 12);

        // Storing all account instances in an array for easy iteration
        BankAccount[] accounts = {account1, account2, account3, account4};

        // Looping through each account and displaying details
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Balance: $" + account.balance);
            account.displayAccountType(); // Calls the overridden method based on the object type
            System.out.println();
        }
    }
}
