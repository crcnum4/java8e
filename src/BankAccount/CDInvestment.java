package BankAccount;

import Bank.Client;

public class CDInvestment extends InvestmentAccount implements Account {
    private int timeFrame = 3;
    private String timePeriod = "Y";

    public CDInvestment(int balance, int accountNum, Client owner, int interestRate, int period, int timeFrame) {
        super(balance, accountNum, owner, interestRate, period, "M");
        this.timeFrame = timeFrame;
    }

    public void checkIfInterest(int time) {
        if(time >= timeFrame && balance > 0) {
            applyInterest();
        }
    }

    @Override
    public void withdraw(int amt) {
        return;
    }
}