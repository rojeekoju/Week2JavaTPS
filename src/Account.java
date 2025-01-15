// Account.java
public abstract class Account {
    private int accountNumber;
    private String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Implement a deposit

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    // Overload withdraw method to accept an additional fee parameter (withdraw(double amount, double fee)):
    // Withdraw the given amount plus the fee. Use assertions and handle
    // exceptions properly.

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Override the toString() method to provide a string representation of the account.

}