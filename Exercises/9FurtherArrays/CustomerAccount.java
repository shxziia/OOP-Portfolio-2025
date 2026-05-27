public class CustomerAccount {
    private String customerName;
    private double balance;

    public CustomerAccount(String customerName, double initialDeposit) {
        this.customerName = customerName;
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit cannot be negative.");
        }
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + " to " + customerName + "'s account.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for " + customerName + ".");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + customerName + "'s account.");
        }
    }

    public void addInterest(double rate) {
        balance += balance * rate;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String toString() {
        return customerName + " - Balance: $" + String.format("%.2f", balance);
    }
}



