package Assgn3.Templates.Task1;

public class CheckingAccount extends BankAccount {
    // Implement the withdraw() method for Checking Account
public CheckingAccount (int accountNumber, double balance) {
    super(accountNumber, balance);
}

@Override
public void withdraw(double amount) {
    if ((amount > 0) && (amount <= balance)) {
        balance -= amount;
        System.out.println("Withdrawl from Checking for : $" + amount);
    }
    else {
        System.out.println("Insufficient funds in checking.");
    }
}
}

