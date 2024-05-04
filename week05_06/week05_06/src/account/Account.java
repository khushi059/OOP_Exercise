package account;

class Account {
    private String name;
    private long acctNumber;
    private double balance;

    // Constructor with name, account number, and balance
    public Account(String name, long acctNumber, double balance) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    // Constructor with name and account number (initial balance is zero)
    public Account(String name, long acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = 0.0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account number
    public long getAcctNumber() {
        return acctNumber;
    }

    // Method to get the account holder's name
    public String getName() {
        return name;
    }
}

