package se.lexicon;

public class BankAccount {

    // Fields (encapsulated)
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor with validation
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        setOwnerName(ownerName);   // validate name
        this.balance = balance;
    }

    // --- VALIDATION ---
    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name cannot be empty");
        }
        if (ownerName.length() < 2) {
            throw new IllegalArgumentException("Owner name must be at least 2 characters");
        }
        this.ownerName = ownerName;
    }

    // --- GETTERS ---
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // --- ACCOUNT OPERATIONS ---
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
