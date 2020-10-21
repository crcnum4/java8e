package Yahtzee;

import java.util.Random;

public class YahtzeeDie extends Die {

    public YahtzeeDie() {
        super();
        roll(new Random());
    }
}
