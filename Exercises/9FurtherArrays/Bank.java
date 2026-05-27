public class Bank {
    private CustomerAccount[] accounts;
    private int accountCount;

    public Bank() {
        accounts = new CustomerAccount[30];
        accountCount = 0;
    }

    public void createAccount(String name, double initialDeposit) {
        if (accountCount >= 30) {
            System.out.println("Cannot create more than 30 accounts.");
            return;
        }
        accounts[accountCount] = new CustomerAccount(name, initialDeposit);
        System.out.println("Account created for " + name);
        accountCount++;
    }

    public CustomerAccount findAccount(String name) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getCustomerName().equalsIgnoreCase(name)) {
                return accounts[i];
            }
        }
        System.out.println("Account not found for " + name);
        return null;
    }

    public void addInterestToAll(double rate) {
        for (int i = 0; i < accountCount; i++) {
            accounts[i].addInterest(rate);
        }
        System.out.println("Added " + (rate * 100) + "% interest to all accounts.");
    }

    public void displayAllAccounts() {
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
        }
    }
}
