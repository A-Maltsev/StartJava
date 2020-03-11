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

    public void startGame() {
        do {
            if (game(playerOne)) {
                System.out.println("Игрок " + playerOne.getName() + " выиграл!");
                break;
            }
            if (game(playerTwo)) {
                System.out.println("Игрок " + playerTwo.getName() + " выиграл!");
                break;
            }
        } while (true);
    }

    private boolean game(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число от 1 до 100");
        int playerNumber = scanner.nextInt();
        player.setNumber(playerNumber);
        if (computerNumber > player.getNumber()) {
            System.out.println("Ваше число меньше загаданного.");
            return false;
        } else if (computerNumber < player.getNumber()) {
            System.out.println("Ваше число больше загаданного.");
            return false;
        } else {
            return true;
        }
    }
}