package CardGames;

import BlackJack.Actors.Actor;
import BlackJack.Actors.Dealer;
import BlackJack.Actors.Player;
import BlackJack.BlackJackHand;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Rigged();
        myDeck.shuffle();
//        Actor player = new Player();
        BlackJackHand myHand = new BlackJackHand(new Player());
        if (myHand.getActor() instanceof Player) {
            myHand.bet = myHand.getActor().setBet();
        };

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
        System.out.println(myHand.getScore() > 21 ? "Bust! Loose " + myHand.bet : "No Bust, win " + myHand.bet);
    }
}
