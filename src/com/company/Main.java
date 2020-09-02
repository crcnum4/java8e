package com.company;

import Bank.CheckingAccount;
import Bank.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        CheckingAccount myCheck = new CheckingAccount(1234, 3500, "Chang");
        SavingsAccount myAcct = new SavingsAccount(777, 1000, "Clifton", 5);
        System.out.println(myAcct.getDetails());
        myAcct.withdraw(100000000);
        System.out.println(myAcct.getDetails());
        myAcct.deposit(50);
        System.out.println(myAcct.getDetails());
//        System.out.println(myCheck.getDetails());
//        myCheck.deposit(200);
//        myCheck.withdraw(500);
//        System.out.println(myCheck.getDetails());
        myAcct.applyInterest();
        System.out.println(myAcct.getDetails());

    }
}
