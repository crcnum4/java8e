package Yahtzee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class YahtzeeConsole extends Console {

    static public void welcome() {
        welcome("Yahtzee");
    }

    static public void displayHand(List<Integer> dice) {
        System.out.println("---------");
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
            die.roll(new Random());
        }
        System.out.print("\n---------\n");
    }

    static public int getChoice() {
        System.out.print("Which die do you want to reroll 1-5: ");
        String input = scanner.nextLine();
        return Integer.parseInt(input) - 1;
    }

    static public List<Integer> getChoices() {
        System.out.print("Which dice do you want to reroll 1-5 Ex 1 2 4: ");
        String input = scanner.nextLine(); // "1 2 4"
        String[] inputArray = input.split(" "); // ["1", "2", "4"]
        List<Integer> choices = new ArrayList<Integer>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice) - 1);
        }
        return choices;
//        int[] choices = new int[input.length()];
//        for (int i = 0; i < input.length(); i++ ) {
//            choices[i] = Integer.parseInt(inputArray[i]) - 1;
//        }
    }

}
