package Bank;

import BankAccount.CDInvestment;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String firstName;
    private String lastName;
    private String middleName;
    private String clientId;
//    private String Address
    private List<CheckingAccount> checkingAccounts;
    private List<SavingsAccount> savingsAccounts;
    private List<CDInvestment> cdInvestments;

    public Client(String firstName, String lastName, String clientId) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        this.checkingAccounts = new ArrayList<CheckingAccount>();
        this.savingsAccounts = new ArrayList<SavingsAccount>();
        this.cdInvestments = new ArrayList<CDInvestment>();
    }

    public void addAccount(CheckingAccount account) {
        checkingAccounts.add(account);
    }

    public void addAccount(SavingsAccount account) {
        savingsAccounts.add(account);
    }

}
