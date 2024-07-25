package org.example;

public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to the account. New balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn from the account. New balance: " + balance);
        }
    }

    // Method to print account details
    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount object with $500
        BankAccount account = new BankAccount("Lia Martinez", 500);

        // Deposit $100 into the account
        account.deposit(100);

        // Print the account details
        account.printAccountDetails();
    }
}
