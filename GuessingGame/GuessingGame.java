package GuessingGame;

import java.util.Scanner;

public class GuessingGame {

    final static int randomNum = createRandomNumber();
    static int userGuess = getUserGuess();
    static boolean winCondition = false;

    public static void main(String[] args) {

        // while (!winCondition) {
        // getUserGuess();
        // }
        // winCondition = didYouWin(userGuess);

    }

    public static final int createRandomNumber() {
        return (int) (Math.random() * 100 + 1);
        // Have to typecast to int because Math.random() returns a double betwen 0.0 and
        // 1.0
    }

    public static int getUserGuess() {
        System.out.println("Guess a number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        scan.close();
        return guess;
    }

    public int getUserGuess(int i) { // Overload for testing purposes
        return i;
    }

    public static boolean didYouWin(int guess) {
        if (guess == randomNum) {
            return true;
        } else {
            return false;
        }
    }

    public boolean didYouWin(int guess, int testNum) {
        if (guess == testNum) {
            return true;
        } else {
            return false;
        }
    }

}