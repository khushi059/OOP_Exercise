package account;

public class Transactions {
    public static void main(String[] args) {
        // Create an account with initial balance
        Account acct1 = new Account("Jhon Chester", 976555557, 1000.0);
        System.out.println("Account Holder: " + acct1.getName());
        System.out.println("Account Number: " + acct1.getAcctNumber());
        System.out.println("Initial Balance: " + acct1.getBalance());

        // Create an account with zero initial balance
        Account acct2 = new Account("David Rai", 1458567321);
        System.out.println("\nAccount Holder: " + acct2.getName());
        System.out.println("Account Number: " + acct2.getAcctNumber());
        System.out.println("Initial Balance: " + acct2.getBalance());

        // Deposit and withdraw from the second account
        acct2.deposit(250.0);
        acct2.withdraw(100.0);
        System.out.println("\nFinal Balance after transactions: " + acct2.getBalance());
    }
}

