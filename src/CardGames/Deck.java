package CardGames;

public interface Deck {
    void shuffle();
    Card draw(boolean facing);
    Boolean isEmpty();
}
