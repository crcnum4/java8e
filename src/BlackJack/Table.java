package BlackJack;

import BlackJack.Actors.Dealer;
import CardGames.Deck;
import CardGames.Standard;
import Yahtzee.Hand;

public class Table {
    private BlackJackHand dealersHand = new BlackJackHand(new Dealer());
    private Deck deck = new Standard();

    public Deck getDeck() {
        return deck;
    }

    public BlackJackHand getDealersHand() {
        return dealersHand;
    }
}
