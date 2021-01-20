package BlackJack;

import BlackJack.Actors.Dealer;
import BlackJack.Actors.Player;
import CardGames.Deck;
import CardGames.Rigged;
import CardGames.Standard;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private BlackJackHand dealer = new BlackJackHand(new Dealer());
//    private BlackJackHand player = new BlackJackHand(new Player());
    // List of players hands.
    private List<BlackJackHand> players = new ArrayList<BlackJackHand>();
    private int playerCount = -1;
    private Deck deck = new Standard();

    public Deck getDeck() {
        return deck;
    }

    public int getPlayerCount() {return playerCount;}

    public BlackJackHand getDealer() {
        return dealer;
    }
//    public BlackJackHand getPlayer() { return player; }
    public List<BlackJackHand> getPlayers() {return players;}

    public void createPlayers() {
        do {
            playerCount = Console.requestInt("How many players");
        } while (playerCount < 0 || playerCount > 4);
        if (playerCount == 0) {
            System.out.println("Quitting no players...");
            System.exit(0);
        }
        for (int count = 0; count < playerCount; count++) {
            players.add(new BlackJackHand(new Player()));
        }
    }

    public void cleanTable() {
        while(players.size() > playerCount) {
            players.remove(players.size() - 1);
        }
    }
}
