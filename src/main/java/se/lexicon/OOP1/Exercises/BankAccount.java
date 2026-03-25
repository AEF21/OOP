package se.lexicon.OOP1.Exercises;

public class BankAccount {

    // Fields (encapsulated)
    private final String accountNumber; // String is correct for account numbers
    private String ownerName;
    private double balance;             // double for money in exercises

    // Constructor with validation
    public BankAccount(String accountNumber, String ownerName, double balance) {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;

        setOwnerName(ownerName);
        this.balance = balance;
    }

    // --- VALIDATION ---
    private void validateAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (accountNumber.length() < 2) {
            throw new IllegalArgumentException("Account number must be at least 2 digits");
        }
    }

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
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    // --- toString for clean printing ---
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
