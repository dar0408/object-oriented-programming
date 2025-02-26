// Problem 3: Bank Account Management



public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount(123456789, "John Doe", 5000.0);

        // Modify balance using public method
        account1.deposit(2000.0);

        // Create a SavingsAccount object and display details
        SavingsAccount savingsAccount1 = new SavingsAccount(987654321, "Alice Johnson", 10000.0);
        savingsAccount1.displaySavingsAccountDetails();
    }
}

class BankAccount {
    public int accountNumber;  // public field
    protected String accountHolder;  // protected field
    private double balance;    // private field

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter methods for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display SavingsAccount details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Balance: " + getBalance()); // Using public method to access private balance
    }
}





// Create a BankAccount class with:
// accountNumber (public).
// accountHolder (protected).
// balance (private).
// Write methods to:
// Access and modify balance using public methods.
// Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
