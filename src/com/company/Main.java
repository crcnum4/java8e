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
        Deck deck = new Rigged();
        deck.shuffle();
        Card card = deck.draw();

        System.out.println(card);
    }
}
