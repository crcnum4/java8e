package Bank;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNum, int balance, String owner) {
        super(accountNum, balance, owner, "Checking");
    }
}
