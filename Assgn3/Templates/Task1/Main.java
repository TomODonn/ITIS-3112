package Assgn3.Templates.Task1;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(123456, 500.0);
        SavingsAccount savingsAccount = new SavingsAccount(789012, 1000.0);
        
        // Perform deposit, withdrawal, and display balance operations
        checkingAccount.deposit(300.00);
        savingsAccount.deposit(200.00);

        checkingAccount.withdraw(125.00);
        savingsAccount.withdraw( 50.00);

        checkingAccount.displayBalance();
        savingsAccount.displayBalance();
        // Display checking account details
        
        // Display savings account details
    }
}

