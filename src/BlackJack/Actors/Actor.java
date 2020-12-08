package BlackJack.Actors;

public interface Actor {
//    String name = "Actor";
    String getName();
    int getBet();
    int getAction(int score);
}
