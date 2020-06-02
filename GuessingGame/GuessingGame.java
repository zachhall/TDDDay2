package GuessingGame;

import java.util.Scanner;

public class GuessingGame {

    static int randomNum = createRandomNumber();
    static int numGuess = 0;
    static boolean winCondition = false;
    static boolean quitCondition = false;
    static int attempts = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (!winCondition && !quitCondition) {
            int userGuess = getUserGuess();
            didYouWin(userGuess);
        }
        System.out.println("Goodbye!");
        scan.close();
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

        if (attempts == 4) {
            System.out.println("This is your last attempt!");
        } else if (attempts > 0) {
            System.out.println("You have " + (5 - attempts) + " attempts left");
        }

        String guess = scan.next(); // Intakes String

        if (guess.equals("Quit")) { // Test if string entered is Quit
            System.out.println("See you next time!");
            quitCondition = true; // Should break out of our main() while loop
        } else {
            numGuess = Integer.parseInt(guess);
            // Similar to our StringCalculator yesterday, if user input isn't an integer an
            // exception will be thrown
        }
        return numGuess;

    }

    public String getUserGuess(String guess) { // Overload for testing purposes
        return guess;
    }

    public int getUserGuess(int guess) {
        return guess;
    }

    public static void didYouWin(int guess) {
        if (guess == randomNum) {
            System.out.println("Congrats, you win!");
            winCondition = true;
        } else {
            attempts += 1;
            if (attempts == 5) {
                System.out.println("You didn't guess the right number in time.\nYou lost!");
                quitCondition = true;
            } else if (guess > randomNum) {
                System.out.println("Sorry, your guess is too high. Try again.");
            } else if (guess < randomNum) {
                System.out.println("Sorry, your guess is too low. Try again.");
            }
        }
    }

    public boolean didYouWin(int guess, int testNum) { // Overload for testing
        if (guess == testNum) {
            return true;
        } else {
            return false;
        }
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int i) {
        attempts = i;
    }

    public int setRandomNum(int i) {
        randomNum = i;
        return randomNum;
    }

    public int setNumGuess(int i) {
        numGuess = i;
        return numGuess;
    }

}