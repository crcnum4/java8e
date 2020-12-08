package CardGames;

import BlackJack.Actors.Actor;
import BlackJack.Actors.Dealer;
import BlackJack.BlackJackHand;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Standard();
        myDeck.shuffle();
        Actor dealer = new Dealer();
        BlackJackHand myHand = new BlackJackHand(dealer);

        myHand.addCard(myDeck.draw());
        myHand.addCard(myDeck.draw());
        System.out.print(myHand.getName() + ": ");
        System.out.println(myHand);
        System.out.println(myHand.getScore());
        System.out.println(myHand.getActor().getAction(myHand.getScore()));
        myHand.addCard(myDeck.draw());
        System.out.print(myHand.getActor().getName() + ": ");
        System.out.println(myHand);
        System.out.println(myHand.getScore());
        System.out.println(myHand.getActor().getAction(myHand.getScore()));
        myHand.addCard(myDeck.draw());
        System.out.print(myHand.getActor().getName() + ": ");
        System.out.println(myHand);
        System.out.println(myHand.getScore());
        System.out.println(myHand.getActor().getAction(myHand.getScore()));
    }
}
