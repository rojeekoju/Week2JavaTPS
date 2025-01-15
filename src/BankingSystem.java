// BankingSystem.java
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        Bank<Account> bank = new Bank<>();

        // Create accounts
        SavingsAccount savings = new SavingsAccount(1, "Alice", 0.03);
        CheckingAccount checking = new CheckingAccount(2, "Bob", 500.0);

        // Add accounts to the bank
        bank.addAccount(savings);
        bank.addAccount(checking);

        System.out.println("Initial Account States:");
        bank.listAccounts(bank.getAccounts());
        System.out.println();

        // Perform transactions through the bank
        bank.performTransaction(savings, 1000); // Deposit into savings
        bank.performTransaction(checking, 500); // Deposit into checking

        bank.performTransaction(savings, -200); // Withdraw from savings
        bank.performTransaction(checking, -600); // Withdraw from checking

        bank.performTransaction(checking, -200, 10); // Withdraw with a fee

        System.out.println("\nFinal Account States:");
        bank.listAccounts(bank.getAccounts());

        System.out.println("\nTotal Balance Across All Accounts: $" +
                Bank.calculateTotalBalance(bank.getAccounts()));
    }
}