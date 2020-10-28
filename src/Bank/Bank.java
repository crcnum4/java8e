package Bank;

import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;

import java.util.HashMap;

public class Bank {
    private String name;
    private int safeAmt;
    private HashMap<String, Client> clients;
    private HashMap<Integer, Account> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;

    public Bank(String name) {
        this.name = name;
        clients= new HashMap<>();
        accounts = new HashMap<>();
    }

    public void addAccount() {
        // TODO: get client
        // TODO: create account giving it the client.
        Account newAccount = new Account();
    }

    public Account createAccount() {}

    public SavingsAccount creatsSavingsAccount() {};
    public CheckingAccount creactCheckingAccount() {};
}
