package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("У вас 10 попыток");

        System.out.print("Имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();
        Player playerOne = new Player(firstPlayerName, new int[10], 0);
        System.out.print("Имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        Player playerTwo = new Player(secondPlayerName, new int[10], 0);

        String continuePlay;

        do {
            GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo, new int[10]);
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                continuePlay = scanner.next();
            } while (!continuePlay.equals("да") && !continuePlay.equals("нет"));
        } while (!continuePlay.equals("нет"));
    }
}
