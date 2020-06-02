package GuessingGame;

public class GuessingGame {

    public static void main(String[] args) {

        final int randomNum = createRandomNumber();

    }

    public static final int createRandomNumber() {
        return (int) (Math.random() * 100 + 1);
        // Have to typecast to int because Math.random() returns a double betwen 0.0 and
        // 1.0
    }

}