package BlackJack;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static int requestInt(String text) {
        //TODO change to nextLine and add number validation;
        System.out.println(text);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public static String requestString(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }
}
