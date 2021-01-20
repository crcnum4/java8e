package com.company;

import Bank.Bank;
import Bank.Client;
import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;
import BankTools.Chaos;
import BankTools.Console;
import BankTools.UI;
import CardGames.Card;
import CardGames.Deck;
import CardGames.Rigged;
import CardGames.Standard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        UI ui = new Chaos();
        Bank cdFinancial = new Bank("CD Financial");
        cdFinancial.addClient("Cliff", "Choiniere");
        cdFinancial.addAccount("1", "checking", 10000, ui);
        cdFinancial.addAccount("1", "savings", 15000, ui);
        cdFinancial.displayClients();

        cdFinancial.addDebitCard(ui, "1", 1);
        cdFinancial.displayClients();
    }
}
