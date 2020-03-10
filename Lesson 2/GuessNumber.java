import java.util.Random;

public class GuessNumber {
    Random random = new Random();

    private int computerNumber = random.nextInt(100);

    public boolean getWin(int playerNumber) {
        if (computerNumber > playerNumber) {
            System.out.println("Ваше число меньше загаданного.");
            return false;
        } else if (computerNumber < playerNumber) {
            System.out.println("Ваше число больше загаданного.");
            return false;
        } else {
            return true;
        }
    }
}
