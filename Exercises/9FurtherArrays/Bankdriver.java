public class Bankdriver {
    public static void main(String[] args) {
        Bank llBank = new Bank();

        llBank.createAccount("Alice", 1000);
        llBank.createAccount("Bob", 500);

        System.out.println();

        CustomerAccount alice = llBank.findAccount("Alice");
        if (alice != null) {
            alice.deposit(200);
            alice.withdraw(150);
            alice.withdraw(2000);
        }

        System.out.println();

        CustomerAccount bob = llBank.findAccount("Bob");
        if (bob != null) {
            bob.deposit(-50);
            bob.withdraw(50);
        }

        System.out.println();

        llBank.addInterestToAll(0.03);
        System.out.println();

        llBank.displayAllAccounts();
    }
}
