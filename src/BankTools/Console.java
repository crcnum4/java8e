package BankTools;

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
}
