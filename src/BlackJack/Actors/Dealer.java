package BlackJack.Actors;

public class Dealer implements Actor {
    static String NAME = "Dealer";
    static int DECISION = 17;
    static int HIT = 1;
    static int STAND = 2;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int setBet() {
        return 0;
    }

    @Override
    public int getAction(int score, boolean isPair, int cardCount) {
        return score < DECISION ? HIT : STAND;
    }
}