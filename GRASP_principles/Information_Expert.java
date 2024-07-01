// Transaction class
class Transaction {
    private double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

/* Information Expert Principle: The BankAccount class follows the Information Expert principle 
by managing its own balance and processing transactions. This is because the BankAccount class has 
the information needed to update its balance correctly based on transactions.
 */
// BankAccount class (Information Expert)
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(Transaction transaction) {
        balance += transaction.getAmount();
    }

    public void withdraw(Transaction transaction) {
        if (transaction.getAmount() <= balance) {
            balance -= transaction.getAmount();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

// Main class to test the implementation
public class Information_Expert {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        account.displayBalance();

        Transaction deposit = new Transaction(200.00);
        account.deposit(deposit);
        account.displayBalance();

        Transaction withdrawal = new Transaction(150.00);
        account.withdraw(withdrawal);
        account.displayBalance();

        Transaction withdrawalTooMuch = new Transaction(2000.00);
        account.withdraw(withdrawalTooMuch);
        account.displayBalance();
    }
}
