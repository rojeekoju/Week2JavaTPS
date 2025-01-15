// CheckingAccount.java
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    /*
    Overload the withdraw method to check if the withdrawal exceeds the overdraft limit.
    Use assertions.
    Overload the deposit method to check if the deposit is greater than 0.
    Use assertions.
     */

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}