class BankAccount {
    // Private fields
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting to ₹0");
            this.balance = 0;
        }
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main class to test
public class Main6 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC12345", 1000);

        myAccount.displayInfo();
        myAccount.deposit(500);     // Depositing money
        myAccount.withdraw(200);    // Withdrawing money
        myAccount.withdraw(2000);   // Trying to withdraw more than balance
        myAccount.deposit(-100);    // Invalid deposit
    }
}

