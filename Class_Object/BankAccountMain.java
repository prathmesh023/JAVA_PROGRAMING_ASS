// Create a class BankAccount with account number and balance.
// Deposit money and display updated balance.

class BankAccount {

    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.accountNumber = 12345;
        b1.balance = 10000;

        b1.deposit(5000);

        System.out.println("Updated Balance: " + b1.balance);
    }
}

/*
Output:
Updated Balance: 15000.0
*/