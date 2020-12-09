package BlackJack;

import BlackJack.Actors.Actor;
import CardGames.Card;

public class BlackJack {
    Table table = new Table();

    public void play() {
        // deal cards to actor
        // 1 face down 1 face up.
        table.getDeck().shuffle();
        deal();
        // display cards
        displayTable();
        // TODO: bet
        // display Actor cards and score
        do {} while (!actorTurn(table.getDealersHand()));

    }

    private boolean actorTurn(BlackJackHand hand) {
        displayHand(hand);
        return performAction(hand, getAction(hand));
    }

    private int getAction(BlackJackHand hand) {
        return hand.getActor().getAction(hand.getScore()); // 1 or 2
    }

    private boolean performAction(BlackJackHand hand, int action) {
        switch (action) {
            case 1:
                Card card = table.getDeck().draw();
                System.out.println(hand.getName() +" Hit and was dealt " + card);
                hand.addCard(card);
                if (hand.getScore() > 21) {
                    System.out.println("Busted " + hand.getScore());
                    return true;
                }
                return false;
            case 2:
                System.out.println(hand.getName() + " Stood.");
                return true;
            default:
                System.out.println("error! default case hit");
                return true;
        }
    }

    // TODO: don't copy in final
    private void deal() {
        table.getDealersHand().addCard(table.getDeck().draw());
        table.getDealersHand().addCard(table.getDeck().draw());
    }

    private void displayTable() {
        System.out.println(table.getDealersHand());
    }

    private void displayHand(BlackJackHand hand) {
        System.out.println(hand);
        System.out.println(hand.getName() + " score is: " + hand.getScore());
    }
}
