import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private int computerNumber = random.nextInt(100);
    int playerNumber;

    public void startGame() {
        do {
            if (game(playerOne.getName())) {
                System.out.println("Игрок " + playerOne.getName() + " выиграл!");
                break;
            }
            if (game(playerTwo.getName())) {
                System.out.println("Игрок " + playerTwo.getName() + " выиграл!");
                break;
            }
        } while (true);
    }

    private boolean game(String playerName) {
        System.out.println("Игрок " + playerName + ", введите число от 1 до 100");
        playerNumber = scanner.nextInt();
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