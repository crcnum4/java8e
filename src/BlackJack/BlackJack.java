package BlackJack;

import BlackJack.Actors.Player;
import CardGames.Card;
import Yahtzee.Hand;

// TODO: detect blackJack

public class BlackJack {
    Table table = new Table();

    public void play() {
        // deal cards to actor
        // 1 face down 1 face up.
        table.getDeck().shuffle();
        deal();
        // display card;
        setBet(table.getPlayer());
        displayTable();
        // display Actor cards and score
        table.getPlayer().revealHand();
        do {} while (!actorTurn(table.getPlayer()));
        table.getDealer().revealHand();
        do {} while (!actorTurn(table.getDealer()));
        // determine if Player won.
        endRound(table.getPlayer());
        System.out.println(((Player)table.getPlayer().getActor()).getWallet());

    }

    private void endRound(BlackJackHand player) {
        char result = didWin(player);
        switch (result) {
            case 'n':
                System.out.println(player.getName() + " looses " + player.getBet());
                ((Player) player.getActor()).adjustWallet(player.getBet() * -1);
                break;
            case 'y':
                System.out.println(player.getName() + " wins " + player.getBet());
                ((Player) player.getActor()).adjustWallet(player.getBet());
                break;
            case 'p':
                System.out.println(player.getName() + " pushes with dealer keeps " + player.getBet());
                break;
            default:
                System.out.println("Did win error returned " + result);
        }
    }

    private void setBet(BlackJackHand player) {
        player.setBet();
    }

    private boolean actorTurn(BlackJackHand hand) {
        displayHand(hand);
        return performAction(hand, getAction(hand));
    }

    private int getAction(BlackJackHand hand) {
        return hand.getAction();
    }

    final int HIT = 1, STAND = 2, DOUBLE = 3, SPLIT = 4;

    private boolean performAction(BlackJackHand hand, int action) {
        switch (action) {
            case DOUBLE:
                System.out.println("Double");
//                int bet = hand.getBet();
//                if (bet * 2 <= ((Player) hand.getActor()).getWallet()) {
//                    hand.doubleBet();
//                } else {
//                    System.out.println("ERROR: Not enough money, Hit instead");
//                    action = HIT;
//                }
                hand.doubleBet();
            case HIT:
                Card card = table.getDeck().draw(true);
                System.out.println(hand.getName() +" Hit and was dealt " + card);
                hand.addCard(card);
                if (didBust(hand.getScore())) {
                    System.out.println("Busted " + hand.getScore());
                    return true;
                }
                return action == DOUBLE ? true : false;
            case STAND:
                System.out.println(hand.getName() + " Stood.");
                return true;
            case SPLIT:
                // take the second card out of the hand.
                Card splitCard = hand.removeCard(1);
                // create a second hand.
                BlackJackHand newHand = new BlackJackHand(hand.getActor());
                newHand.addCard(splitCard);
                // deal 1 card to both hands.
                hand.addCard(table.getDeck().draw(true));
                newHand.addCard(table.getDeck().draw(true));
                // duplicate the bet on the second hand.
                newHand.setBet(hand.getBet());
                // add hand to table;
                // allow the play to continue;
            default:
                System.out.println("error! default case Stand");
                return true;
        }
    }

    private void deal() {
        for (int count = 0; count < 2; count++){
            table.getPlayer().addCard(table.getDeck().draw(count == 0 ? false : true));
            table.getDealer().addCard(table.getDeck().draw(count == 0 ? false : true));
        }
    }

    private void displayTable() {
        System.out.println(table.getDealer().getName() + ":  " + table.getDealer());
        System.out.println(table.getPlayer().getName() + ":  " + table.getPlayer());
    }

    private void displayHand(BlackJackHand hand) {
        System.out.println(hand);
        System.out.println(hand.getName() + " score is: " + hand.getScore());
    }

    private char didWin(BlackJackHand player) {
        int playerScore = player.getScore();
        int dealerScore = table.getDealer().getScore();
        if (didBust(playerScore)) {
            System.out.println(player.getName() + " busted!");
            return 'n';
        }
        if (didBust(dealerScore)) {
            System.out.println("Dealer busted!");
            return 'y';
        }
        System.out.println(player.getName() + " has " + playerScore + " | Dealer has " + dealerScore);
        if (playerScore < dealerScore) {
            System.out.println(player.getName() + " looses");
            return 'n';
        }
        if (playerScore == dealerScore) {
            System.out.println("Push!");
            return 'p';
        }

        return 'y';
    }

    private boolean didBust(int score) {return score > 21;}
}
