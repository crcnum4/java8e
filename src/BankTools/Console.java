package BankTools;

import java.util.Random;
import java.util.Scanner;

public class Console implements UI {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int requestInt(String text) {
        //TODO change to nextLine and add number validation;
        System.out.println(text);
        return scanner.nextInt();
    }

    @Override
    public String requestString(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    @Override
    public String randomString(String characters, int length) {
        String[] chars = characters.split("");
        String output = "";
        Random rand = new Random();

        for (int count = 0; count < length; count++) {
            output += chars[rand.nextInt(chars.length)];
        }

        return output;
    }
}
