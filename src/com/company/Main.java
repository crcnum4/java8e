package com.company;

import Bank.Bank;
import Bank.Client;
import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;
import BankTools.Chaos;
import BankTools.Console;
import BankTools.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        UI ui = new Console();
        Bank ourBank = new Bank("Cliff Trust");
        ourBank.addClient("Titus", "Buchanan");
        ourBank.addAccount("1", "checking", 100000, ui);
        ourBank.addAccount("1", "savings", 500000, ui);
        SavingsAccount savingsAccount = (SavingsAccount) ourBank.getAccount(2);
        savingsAccount.applyInterest();
        ourBank.displayClients();
    }
}
