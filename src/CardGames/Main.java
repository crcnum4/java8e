package CardGames;

import BlackJack.Actors.Actor;
import BlackJack.Actors.Dealer;
import BlackJack.Actors.Player;
import BlackJack.BlackJack;
import BlackJack.BlackJackHand;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        game.play();
    }
}
