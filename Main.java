public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add some accounts
        bank.addAccount(1001, 1000.0);
        bank.addAccount(1002, 2000.0);

        // Perform transactions
        bank.performTransaction(1001, "deposit", 500.0);
        bank.performTransaction(1002, "withdraw", 1000.0);

        // Print final balances
        System.out.println("Final balances:");
        System.out.println("Account 1001: $" + bank.getAccount(1001).getBalance());
        System.out.println("Account 1002: $" + bank.getAccount(1002).getBalance());
    }
}
