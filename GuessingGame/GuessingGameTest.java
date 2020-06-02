package GuessingGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessingGameTest {

    GuessingGame guessingGame;

    @Before // This method will be run before any of our tests
    public final void setup() {
        guessingGame = new GuessingGame();
    }

    @Test
    public final void testIfRandomNumberIsBetween1And100() {
        int num = guessingGame.createRandomNumber();
        Assert.assertTrue(num <= 100 && num >= 1);
    }

    @Test
    public final void testDoesUserGuessExist() {
        int guess = guessingGame.getUserGuess();
        Assert.assertTrue(guess <= 100 && guess >= 1);
    }

}