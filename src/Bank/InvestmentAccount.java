package Bank;

public class InvestmentAccount extends BankAccount {
    private int interestRate;
    private int period;
    private char periodType; // D=Day, M=Month, W=Week, Q=Quarter, Y=Year
    static int withdrawFee = 100;

    public InvestmentAccount(int balance, int accountNum, String owner, int interestRate, int period, char periodType) {
        super(accountNum, balance, owner, "Investment");
        this.interestRate = interestRate;
        this.period = period;
        this.periodType = periodType;
    }

    public void applyInterest() {
        deposit((int) (balance * (interestRate / 100f)));
    }

    @Override
    public void withdraw(int amt){
        super.withdraw(amt + withdrawFee);
    }
}
