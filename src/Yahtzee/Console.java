package Yahtzee;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome(String what) {
        System.out.println("Welcome to " + what);
    }

    static public void log(String output) {
        System.out.println(output);
    }

    static public void log(int output) {
        System.out.println(output);
    }
}
