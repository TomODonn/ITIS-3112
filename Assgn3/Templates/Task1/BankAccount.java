package Assgn3.Templates.Task1;

public class BankAccount {
    private int accountNumber;
    protected double balance;

    // Constructor and getter/setter methods
    public BankAccount (int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit (double amount) {
        // Add the amount to the balance
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit to account " + accountNumber + " of: $" + amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw (double amount) {
        // Subtract the amount from the balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient Funds.");
        }
    }
    
    public void displayBalance() {
        // Display the account number and balance
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

