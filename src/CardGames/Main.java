package CardGames;

import BlackJack.BlackJackHand;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Standard();
        myDeck.shuffle();
        BlackJackHand myHand = new BlackJackHand();

        myHand.addCard(myDeck.draw());
        myHand.addCard(myDeck.draw());
        System.out.println(myHand);
        System.out.println(myHand.getScore());
        myHand.addCard(myDeck.draw());
        System.out.println(myHand);
        System.out.println(myHand.getScore());
        myHand.addCard(myDeck.draw());
        System.out.println(myHand);
        System.out.println(myHand.getScore());
    }
}
