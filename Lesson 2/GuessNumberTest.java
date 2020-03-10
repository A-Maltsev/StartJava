import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();

        String continuePlay;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя первого игрока: ");
        playerOne.setName(scanner.nextLine());
        System.out.println("Имя второго игрока: ");
        playerTwo.setName(scanner.nextLine());

        do {

            GuessNumber guessNumber = new GuessNumber();
            do {
                System.out.println("Игрок " + playerOne.getName() + ", введите число от 1 до 100");
                guessNumber.setPlayerNumber(scanner.nextInt());
                if (guessNumber.getWin()) {
                    System.out.println("Игрок " + playerOne.getName() + " выиграл!");
                    break;
                }

                System.out.println("Игрок " + playerTwo.getName() + ", введите число от 1 до 100");
                guessNumber.setPlayerNumber(scanner.nextInt());
                if (guessNumber.getWin()) {
                    System.out.println("Игрок " + playerTwo.getName() + " выиграл!");
                    break;
                }
            } while (true);

            System.out.println("Хотите продолжить? [да/нет]: ");
            continuePlay = scanner.next();
        } while (!continuePlay.equals("нет"));
    }
}
