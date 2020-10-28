package BankAccount;

import Bank.Client;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNum, int balance, Client owner) {
        super(accountNum, balance, owner, "Checking");
    }
}
