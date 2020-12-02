package BlackJack;

import CardGames.Card;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand {
    private List<Card> cards = new ArrayList<>();
    private int score;
    private boolean hasAce;

    public int getCount() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard(int index) {
        return cards.remove(index);
    }

    @Override
    public String toString() {
        String output = "";
        for (var card : cards) {
            output += card + " ";
        }
        return output.trim();
    }

    //KAAA
    // K > sum = 10 hasAce = false
    // A > sum = 21 hasAce = true
    // A > sum = 12 hasAce = false
    // A > value 1 13 hasAce = false

    public int getScore() {
        hasAce = false;
        score = 0;
        for (var card : cards) {
            score += determineValue(card.getValue());
            if (score > 21 && hasAce) {
                score -= 10;
                hasAce = false;
            }
        }
        return score;
    }

    private int determineValue(int card) {
        if (isAce(card) && isSafe()) {
            card = 11;
            hasAce = true;
        } else if (isFace(card)) {
            card = 10;
        }
        return card;
    }

    private boolean isAce (int value) {return value == 1;}

    private boolean isSafe () {return score + 11 <= 21;}

    private boolean isFace (int value) {return value > 10;}

}
