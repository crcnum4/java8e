package BlackJack.Actors;

import BlackJack.Console;

public class Player implements Actor {
    static int HIT = 1, STAND = 2, DOUBLE = 3, SPLIT = 4;
    static Console console = new Console();

    private String name;
    private int wallet;
//    private int bet; // might go to the hand.

    public Player() {
        name = console.requestString("What is your name?");
        wallet = 1000;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override // get the bet for the round.
    public int setBet() {
        int bet;
        do {
            bet = console.requestInt("What is your bet?");
            if (validateBet(bet)) {
                System.out.println("Invalid bet.");
            }
        } while (validateBet(bet));
        return bet;
    }

    public void adjustWallet(int amt) {
        wallet += amt;
    }

    public void adjustWallet(int amt, String method) {
        switch (method) {
            case "win":
//                adjustWallet(amt);
                wallet += amt;
                break;
            case "loose":
//                adjustWallet(amt * -1);
                wallet -= amt;
                break;
        }
    }

    private boolean validateBet(int bet) {return bet > wallet && bet > 0;}

    @Override
    public int getAction(int score) {
        int choice;
        do {
            choice = console.requestInt(
                    "What would you like to do 1=Hit, 2=Stand?"
            );
        } while (choice < 1 || choice > 2);

        return choice;
    }
}
