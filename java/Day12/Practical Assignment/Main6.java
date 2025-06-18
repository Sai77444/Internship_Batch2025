class BankAccount {
 
    private String accountNumber;
    private double balance;

   
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting to ₹0");
            this.balance = 0;
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

  
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

  
    public double getBalance() {
        return balance;
    }

   
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}


public class Main6 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC12345", 1000);

        myAccount.displayInfo();
        myAccount.deposit(500);     
        myAccount.withdraw(200);   
        myAccount.withdraw(2000);  
        myAccount.deposit(-100);    
    }
}

