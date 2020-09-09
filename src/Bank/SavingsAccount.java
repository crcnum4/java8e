package Bank;

public class SavingsAccount extends BankAccount {
    private int interest;

    public SavingsAccount (int accountNum, int balance, String owner, int interest) {
        super(accountNum, balance, owner, "Savings");
        this.interest = interest;
    }

    public void applyInterest() {
        deposit( (int) (balance * ((float) interest / 100.0)));
    }
}
