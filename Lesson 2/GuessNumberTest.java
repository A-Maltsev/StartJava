import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();
        Player playerOne = new Player(firstPlayerName);
        System.out.println("Имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        Player playerTwo = new Player(secondPlayerName);

        String continuePlay;

        do {
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.startGame();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                continuePlay = scanner.next();
            } while (!continuePlay.equals("да") && !continuePlay.equals("нет"));
        } while (!continuePlay.equals("нет"));
    }
}