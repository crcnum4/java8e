package com.company;

import Bank.CheckingAccount;
import Bank.SavingsAccount;
import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CheckingAccount myCheck = new CheckingAccount(1234, 3500, "Chang");
        SavingsAccount myAcct = new SavingsAccount(777, 1000, "Clifton", 5);
        SavingsAccount savings2 = new SavingsAccount(4927, 39998, "Joel", 3);
//        System.out.println(myAcct.getDetails());
        myAcct.withdraw(100000000);
//        System.out.println(myAcct.getDetails());
        myAcct.deposit(50);
        System.out.println(myCheck.getDetails());
        myCheck.deposit(200);
        myCheck.withdraw(500);
        System.out.println(myCheck.getDetails());
        myAcct.applyInterest();
//        System.out.println(myAcct.getDetails());
        DebitCard myCard = new DebitCard(
                "1234 1234 1234 1122",
                "1234",
                "223",
                "Cliff",
                myCheck,
                new ArrayList<SavingsAccount>(Arrays.asList(myAcct, savings2))
                );
        System.out.println(myCheck.getDetails());
        System.out.println(myCard.charge(50, "1234") ? "Approved" : "Declined");
        System.out.println(myCheck.getDetails());
        System.out.println(myCard.charge(200, "3218") ? "Approved" : "Declined");
        System.out.println(myCheck.getDetails());
    }
}
