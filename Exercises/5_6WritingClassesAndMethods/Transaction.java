public class Transaction {
    public static void main(String[] args) {

        Account account1 = new Account("Jamie Fox", "573951");

        System.out.println("Account was created with zero Balance");
        System.out.println(account1.getAccountDetails());

        account1.deposit(1000);

        account1.withdraw(500);

        System.out.println("\nAccounts updated Details: ");
        System.out.println(account1.getAccountDetails());
    }
}
