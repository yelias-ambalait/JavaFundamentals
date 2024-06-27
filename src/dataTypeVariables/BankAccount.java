package dataTypeVariables;

public class BankAccount {
    private double balance;

    public  BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(1300.00);
        System.out.println(account.balance);

        double convertedAmount = BankAccount.convertCurrency(1000, 1.1);
        System.out.println("Converted Amount: " + convertedAmount);
    }
}
