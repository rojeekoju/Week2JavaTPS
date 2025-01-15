// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    
    //Overload the withdraw method to check if the withdrawal exceeds the overdraft limit.
    //Use assertions.

    public void withdraw(double amount) throws InsufficientFundsException {
        assert amount > 0 : "Withdrawal amount must be positive";

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for the withdrawal.");
        }

        balance -= amount;
    }



    //Overload the deposit method to check if the deposit is greater than 0.
    //Use assertions.
    public void deposit(double amount) {
        assert amount > 0 : "Deposit amount must be positive";
        balance += amount;
    }

    public double getInterestRate() {
        return interestRate;
    }
}