package BankTools;

import java.util.Random;

public class Chaos implements UI{
    Random rand = new Random();

    @Override
    public int requestInt(String text) {
        return rand.nextInt(10) + 1;
    }

    @Override
    public String requestString(String text) {
        String[] options = {"D", "W", "B", "M", "Q", "Y"};
        return options[rand.nextInt(options.length)];
    }
}
