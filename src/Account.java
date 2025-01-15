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

    public  void deposit(double amount){
          assert amount > 0 ;
          balance += amount;
}


    public abstract void withdraw(double amount) throws InsufficientFundsException;

    // Overload withdraw method to accept an additional fee parameter (withdraw(double amount, double fee)):
    public void withdraw(double amount, double fee) throws InsufficientFundsException{
        assert amount > 0;
        assert fee >= 0;
        double totalAmount = amount + fee;
        if (totalAmount > balance) {
            throw new InsufficientFundsException("Insufficient funds for the withdrawal and fee.");
        }

        balance -= totalAmount;
    }
 

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

@Override
    public String toString() {
        return "Account Number: " + accountNumber + 
               ", Account Holder: " + accountHolder + 
               ", Balance: " + balance;
    }
}