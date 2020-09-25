package com.company;

import Yahtzee.Hand;
import Yahtzee.YahtzeeConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        YahtzeeConsole.welcome();
        Hand myHand = new Hand();
        myHand.roll(rand);
        YahtzeeConsole.displayHand(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayHand(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayHand(myHand.getDice());
    }
}
