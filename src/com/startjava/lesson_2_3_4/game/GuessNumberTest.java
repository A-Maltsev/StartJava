package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("У вас 10 попыток");

        System.out.print("Имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();
        Player playerOne = new Player(firstPlayerName);
        System.out.print("Имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        Player playerTwo = new Player(secondPlayerName);

        String answer = "да";
        while (answer.equals("да")) {

            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
            guessNumber.startGame();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
            scanner.nextLine();
        }
    }
}
