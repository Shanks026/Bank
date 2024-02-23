public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("----Deposit----");
        balance = balance + amount;
        System.out.println("Deposit Successful");
    }

    public void withdraw(double amount) {
        System.out.println("----Withdraw----");
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
