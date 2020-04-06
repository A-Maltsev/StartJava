import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private int compNumber = random.nextInt(101);

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        do {
            if (makeMove(playerOne)) {
                System.out.println("Игрок " + playerOne.getName() + " выиграл!");
                break;
            }
            if (makeMove(playerTwo)) {
                System.out.println("Игрок " + playerTwo.getName() + " выиграл!");
                break;
            }
        } while (true);
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        if (compNumber == player.getNumber()) {
            return true;
        } else if (compNumber > player.getNumber()) {
            System.out.println("Ваше число меньше загаданного.");
        } else {
            System.out.println("Ваше число больше загаданного.");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число от 1 до 100");
        int playerNumber = scanner.nextInt();
        player.setNumber(playerNumber);
    }
}