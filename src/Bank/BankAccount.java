package Bank;

public class BankAccount {
    private int accountNum;
    private String owner;
    protected int balance;
    private String type;

    public BankAccount(int accountNum, int balance, String owner, String type) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            return;
        }
        return;
    }

    public String getDetails() {
        return type + " Account, Owner: " + owner + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }

    public int getBalance() {
        return balance;
    }
}

