package GuessingGame;

import java.util.Scanner;

public class GuessingGame {

    final static int randomNum = createRandomNumber();
    static boolean winCondition = false;
    static int attempts = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (!winCondition) {
            int userGuess = getUserGuess();
            didYouWin(userGuess);
        }
        System.out.println("Goodbye!");
    }

    public static final int createRandomNumber() {
        return (int) (Math.random() * 100 + 1);
        // Have to typecast to int because Math.random() returns a double betwen 0.0 and
        // 1.0
    }

    public static int getUserGuess() {
        System.out.println("--- --- ---");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("The correct answer is " + randomNum);
        if (attempts > 0) {
            System.out.println("This is attempt #" + attempts);
        }
        int guess = scan.nextInt();
        return guess;
    }

    public int getUserGuess(int i) { // Overload for testing purposes
        return i;
    }

    public static void didYouWin(int guess) {
        if (guess == randomNum) {
            System.out.println("Congrats, you win!");
            scan.close();
            winCondition = true;
        } else if (guess > randomNum) {
            attempts += 1;

            System.out.println("Sorry, your guess is too high. Try again.");
        } else if (guess < randomNum) {
            attempts += 1;
            System.out.println("Sorry, your guess is too low. Try again.");
        }
    }

    public boolean didYouWin(int guess, int testNum) { // Overload for testing
        if (guess == testNum) {
            return true;
        } else {
            return false;
        }
    }

}