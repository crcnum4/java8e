package BlackJack.Actors;

public interface Actor {
//    String name = "Actor";
    String getName();
    int setBet();
    int getAction(int score, boolean isPair);
}
