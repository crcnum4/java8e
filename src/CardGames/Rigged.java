package CardGames;

import java.util.Scanner;

public class Rigged implements Deck {
    private final static String[] SUITS = {"♤", "♥", "♧", "♦"};

    @Override
    public void shuffle() {
        return;
    }

    @Override
    public Card draw(boolean facing) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card Value: 1 - 13");
        int value = scanner.nextInt();
        System.out.println("Card suit 1 - 4");
        String suit = scanner.next();
        Card card = new Card(value, SUITS[Integer.parseInt(suit) - 1]);
        card.flip();
        return card;
    }

    public Boolean isEmpty() {
        return false;
    }
}
