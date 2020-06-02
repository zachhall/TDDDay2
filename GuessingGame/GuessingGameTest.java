package GuessingGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessingGameTest {

    GuessingGame guessingGame;

    @Before // This method will be run before any of our tests
    public final void setup() {
        guessingGame = new GuessingGame();
        guessingGame.setAttempts(5);
    }

    @Test
    public final void testIfRandomNumberIsBetween1And100() {
        int num = GuessingGame.createRandomNumber();
        Assert.assertTrue(num <= 100 && num >= 1);
    }

    @Test
    public final void testDoesUserGuessExist() {
        int guess = guessingGame.getUserGuess(25);
        Assert.assertTrue(guess <= 100 && guess >= 1);
    }

    @Test
    public final void testDidUserWin() {
        int randomNum = guessingGame.setRandomNum(10);
        int numGuess = guessingGame.setNumGuess(10);
        Assert.assertTrue(guessingGame.didYouWin(randomNum, numGuess));
    }

    @Test
    public final void testIfTheUserWantsToQuit() {
        Assert.assertEquals("Quit", guessingGame.getUserGuess("Quit"));
    }

    @Test
    public final void testIfUserHasUsedAllAvailableAttempts() {
        int attempts = guessingGame.getAttempts();
        Assert.assertTrue(attempts <= 5);
    }

}