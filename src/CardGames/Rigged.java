package CardGames;

import java.util.Scanner;

public class Rigged implements Deck {

    @Override
    public void shuffle() {
        return;
    }

    @Override
    public Card draw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card Value: 1 - 13");
        int value = scanner.nextInt();
        System.out.println("Card suit 1 - 4");
        String suit = scanner.nextLine();
        return new Card(value, suit);
    }
}
