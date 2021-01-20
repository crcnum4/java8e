package BankTools;

import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;

import java.util.*;

public class DebitCard {
    private String pin;
    private CheckingAccount primary;
    //    private Calendar expDate;
    private String cvv;
    private String cardOwner;
    private String cardNum;
    private List<Account> atmAccounts;

    public DebitCard(String cardNum, String pin, String cvv, String cardOwner, CheckingAccount primary) {
        this.cardNum = cardNum;
        this.pin = pin;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
        this.primary = primary;
        atmAccounts = new ArrayList<>();
    }

    public boolean charge(int amt, String pin) {
        if (this.pin == pin && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

    public void addAccount(Account account) {
        atmAccounts.add(account);
    }

    public String toString() {
        return "cardNum: " + cardNum + "\tpin: " + pin + "\tcvv: " + cvv + "\tBalance: " + primary.getBalance();
    }

}

// create a Client class
// 2 of your own properties
// listArray of CheckingAccounts
// listArray of SavingsAccounts
// a method to add an account to the client (try to use overloading) addAccount()

// create a Bank class
// 2 properties of your own.
// listArray of Clients
// method to add a client
