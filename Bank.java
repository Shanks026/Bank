import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(int accountNumber, double initialBalance) {
        BankAccount acc = new BankAccount(accountNumber, initialBalance);
        accounts.add(acc);
        System.out.println("----Account Added----");
        System.out.println("Account Number: " + accountNumber + ", Initial Bank Balance: $" + initialBalance);
    }

    public BankAccount getAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void performTransaction(int accountNumber, String transactionType, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            if ("deposit".equalsIgnoreCase(transactionType)) {
                account.deposit(amount);
            } else if ("withdraw".equalsIgnoreCase(transactionType)) {
                account.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type.");
            }
        }
    }

}
