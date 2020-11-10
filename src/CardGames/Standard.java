package CardGames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Standard implements Deck {
    private final static String[] SUITS = {"♤", "♥", "♧", "♦"};
    private final static int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private List<Card> cards;

    public Standard() {
        cards = new ArrayList<>();
        for (var suit : SUITS) {
            for (var value : VALUES) {
                cards.add(new Card(value, suit));
            }
        }
    }

    // TODO: Add constructor that will allow custom suit and values

    // TODO: Adding jokers.

    public void shuffle() { Collections.shuffle(cards); }

    public Card draw() {return cards.remove(cards.size() - 1);}

}
