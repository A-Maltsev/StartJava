package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private final int compNumber = random.nextInt(101);

    private final Player playerOne;
    private final Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        int attemptsCount = 10;
        do {
            if (makeMove(playerOne)) {
                int attempt = playerOne.getAttempt();
                System.out.println("Игрок " + playerOne.getName() + " угадал число " + compNumber + " с " + attempt + " попытки!");
                break;
            }
            if (makeMove(playerTwo)) {
                int attempt = playerTwo.getAttempt();
                System.out.println("Игрок " + playerTwo.getName() + " угадал число " + compNumber + " с " + attempt + " попытки!");
                break;
            }
            if (playerOne.getAttempt() == attemptsCount) {
                System.out.println("У игрока " + playerOne.getName() + " закончились попытки!");
                break;
            }
            if (playerTwo.getAttempt() == attemptsCount) {
                System.out.println("У игрока " + playerTwo.getName() + " закончились попытки!");
                break;
            }
        } while (true);
        printEnteredNumbers(playerOne);
        printEnteredNumbers(playerTwo);
        setDefaultValues();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        return checkNumber(player);
    }

    private void inputNumber(Player player) {
        System.out.print("Игрок " + player.getName() + ", введите число от 1 до 100: ");
        int playerNumber = scanner.nextInt();
        player.setNumber(playerNumber);
        player.setAttempt(player.getAttempt() + 1);
    }

    private boolean checkNumber(Player player) {
        if (compNumber == player.getNumber(player.getAttempt())) {
            return true;
        } else if (compNumber > player.getNumber(player.getAttempt())) {
            System.out.println("Ваше число меньше загаданного.");
        } else {
            System.out.println("Ваше число больше загаданного.");
        }
        return false;
    }

    private void printEnteredNumbers(Player player) {
        System.out.print("Числа названные игроком " + player.getName() + ": ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void setDefaultValues() {
        playerOne.fillNumbers();
        playerOne.setAttempt(0);

        playerTwo.fillNumbers();
        playerTwo.setAttempt(0);
    }
}
