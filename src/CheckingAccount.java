// CheckingAccount.java
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    /**
     *     Overload the withdraw method to check if the withdrawal exceeds the overdraft limit.
     *     Use assertions.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        assert amount > 0: "Amount must be greater than zero";

        if (amount > getBalance()
         || amount > overdraftLimit
         ) {
            throw new InsufficientFundsException("Transaction failed: Insufficient funds. Cannot withdraw " + amount);
        }
        balance -= amount;
    }

    /**
     *     Overload the deposit method to check if the deposit is greater than 0.
     *     Use assertions.
     */
    public void deposit (double amount) {
        assert amount > 0: "Amount must be greater than zero";
        balance += amount;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}