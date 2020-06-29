package Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Random generator = new Random();
        int numberToGuess = generator.nextInt(10) + 1;
        int counter = 0;
        int guess = -1;

        Scanner in = new Scanner(System.in);

        System.out.println("Try to guess the number (between 1 and 10): ");
        do {
            guess = in.nextInt();
            if (guess != numberToGuess) {
                if (guess < numberToGuess) {
                    System.out.println("Wrong, the searched number is bigger.");
                } else {
                    System.out.println("Wrong, the searched number is smaller.");
                }
            }
            counter++;
        } while (counter < 3 && guess != numberToGuess);

        if (guess == numberToGuess) {
            System.out.println("You guessed the number!");
        } else {
            System.out.println("Sorry, you couldn't guess the number.");
        }
        in.close();
    }


}
