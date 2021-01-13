package BlackJack;

import BlackJack.Actors.Dealer;
import BlackJack.Actors.Player;
import CardGames.Deck;
import CardGames.Rigged;
import CardGames.Standard;

public class Table {
    private BlackJackHand dealer = new BlackJackHand(new Dealer());
    private BlackJackHand player = new BlackJackHand(new Player());
    // List of players hands.
    private Deck deck = new Rigged();

    public Deck getDeck() {
        return deck;
    }

    public BlackJackHand getDealer() {
        return dealer;
    }
    public BlackJackHand getPlayer() { return player; }
}
