package Assgn3.Templates.Task1;

public class SavingsAccount extends BankAccount {
    // Implement the withdraw() method for Savings Account

    public SavingsAccount (int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((amount > 0) && (amount <= balance)) {
            balance -= amount;
            System.out.println("Withdrawl from Savings for : $" + amount);
        }
        else {
            System.out.println("Insufficient funds in savings.");
        }
    }
}

