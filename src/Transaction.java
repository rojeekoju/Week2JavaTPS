// Transaction.java

/*
Define a class named Transaction that takes a generic type (representing an account)
and includes instance variables for the account and the transaction amount.
Ensure account is generic.

Create a constructor for Transaction that accepts the account and amount as parameters.

Implement a method named execute() that performs the transaction.
If the amount is positive, it should deposit the amount into the account.
If the amount is negative, it should withdraw the amount. Handle exceptions properly.

Add an overloaded execute() method that takes an additional fee parameter for withdrawal
transactions.
 */

//using generics as T
//Using Account (superclass) could probably also work?
//Or T extends Account maybe?
public class Transaction<T> {
    T account;
    double amount;

    public Transaction(T account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        //careful, could have a ClassCastException if not an account
        Account castAccount;
        try {
            castAccount = (Account) account;
        } catch (ClassCastException e) {
            System.out.println("Invalid account");
            return;
        }

        //deposit if positive amount
        if (amount > 0) {
            castAccount.deposit(amount);
        }
        //withdraw if negative
        else if (amount < 0) {
            try {
                castAccount.withdraw(-amount);
            } catch (InsufficientFundsException e) {
                System.out.println("Unable to withdraw, insufficient funds");
            }
        }
    }

    public void execute(double fee) {
        //careful, could have a ClassCastException if not an account
        Account castAccount;
        try {
            castAccount = (Account) account;
        } catch (ClassCastException e) {
            System.out.println("Invalid account");
            return;
        }

        double newAmount = amount - fee;

        if (newAmount > 0) castAccount.deposit(newAmount);
        else if (newAmount < 0) {
            try {
                castAccount.withdraw(-newAmount);
            } catch (InsufficientFundsException e) {
                System.out.println("Unable to withdraw, insufficient funds");
            }
        }
    }
}