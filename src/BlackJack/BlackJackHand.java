package BlackJack;

import BlackJack.Actors.Actor;
import BlackJack.Actors.Dealer;
import BlackJack.Actors.Player;
import CardGames.Card;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand {
    private List<Card> cards = new ArrayList<>();
    private int score;
    private boolean hasAce;
    private Actor actor;
    private int bet;

    public BlackJackHand(Actor actor) {
        this.actor = actor;
    }

    // TODO: ? add constructor that takes one card for a split;

    public Actor getActor() {
        return actor;
    }

    public String getName() {
        return  actor.getName();
    }

    public int size() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard(int index) {
        return cards.remove(index);
    }

    public int getAction() {
        if (actor instanceof Dealer) {
            return actor.getAction(score, "", 0, 0);
        }
        Player player = (Player) actor;
        int maxChoice = 2;
        String query = "What would you like to do 1=Hit, 2=Stand ";
        if (cards.size() == 2 && bet * 2 <= player.getWallet()) {
            // 3 or 4 depending on pair
            query += ", 3=double ";
            maxChoice = 3;
            if (isPair()) {
                query += ", 4=split";
                maxChoice = 4;
            }
        }
        query = query.trim() + "?";

        return actor.getAction(score, query, 1, maxChoice);
    }

    @Override
    public String toString() {
        String output = "";
        for (var card : cards) {
            output += card.isFaceDown() ? "<*> " : card + " ";
        }
        return output.trim();
    }

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

    public void setBet() {
        bet = actor.setBet();
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getBet() {
        return bet;
    }

    public void doubleBet() {
        bet *= 2;
    }

    public void revealHand() {
        for (var card : cards) {
            if (card.isFaceDown()) card.flip();
        }
    }

    public boolean isPair() {
        if (cards.size() > 2) return false;
        return determineValue(cards.get(0).getValue()) == determineValue(cards.get(1).getValue());
    }

    private boolean isAce (int value) {return value == 1;}

    private boolean isSafe () {return score + 11 <= 21;}

    private boolean isFace (int value) {return value > 10;}

//    public static class BlackJack {
//    }
}
