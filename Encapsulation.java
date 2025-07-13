package encapsulation;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accNum, double initialBalance) {
        accountNumber = accNum;
        balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC12345", 1000.0);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.deposit(500);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(300);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

    }
}
