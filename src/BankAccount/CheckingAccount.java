package BankAccount;

public class CheckingAccount extends BankAccount implements Account {
    public CheckingAccount(int accountNum, int balance, String owner) {
        super(accountNum, balance, owner, "Checking");
    }
}
