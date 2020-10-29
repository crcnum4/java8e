package BankAccount;

import Bank.Client;

public class BankAccount implements Account {
    private int accountNum;
    private Client owner;
    protected int balance;
    private String type;

    public BankAccount(int accountNum, int balance, Client owner, String type) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    @Override
    public Client getOwner() {
        return owner;
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            return;
        }
        return;
    }

    public String getDetails() {
        return type + " Account, Owner: " + owner.getName() + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNum() {return accountNum;}
}

