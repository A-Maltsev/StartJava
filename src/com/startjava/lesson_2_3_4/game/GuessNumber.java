package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private final int compNumber = random.nextInt(101);

    private final Player playerOne;
    private final Player playerTwo;

    private int[] playerNumbers;

    public GuessNumber(Player playerOne, Player playerTwo, int[] playerNumbers) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerNumbers = playerNumbers;
    }

    public void startGame() {
        int attemptsCount = 10;
        do {
            if (makeMove(playerOne)) {
                int attempt = playerOne.getAttempt();
                System.out.println("Игрок " + playerOne.getName() + " угадал число " + compNumber + " с " + attempt + " попытки!");
                printMessage(playerOne, playerTwo);
                fillPlayers();
                break;
            }
            if (makeMove(playerTwo)) {
                int attempt = playerTwo.getAttempt();
                System.out.println("Игрок " + playerTwo.getName() + " угадал число " + compNumber + " с " + attempt + " попытки!");
                printMessage(playerOne, playerTwo);
                fillPlayers();
                break;
            }
            if (playerOne.getAttempt() == attemptsCount) {
                System.out.println("У игрока " + playerOne.getName() + " закончились попытки!");
                fillPlayers();
                break;
            }
            if (playerTwo.getAttempt() == attemptsCount) {
                System.out.println("У игрока " + playerTwo.getName() + " закончились попытки!");
                fillPlayers();
                break;
            }
        } while (true);
    }

    private void fillPlayers() {
        int[] playerNumbers;
        playerNumbers = playerOne.getNumbers();
        Arrays.fill(playerNumbers, 0, playerOne.getAttempt(), 0);
        playerOne.setNumbers(playerNumbers);
        playerOne.setAttempt(0);

        playerNumbers = playerTwo.getNumbers();
        Arrays.fill(playerNumbers, 0, playerTwo.getAttempt(), 0);
        playerTwo.setNumbers(playerNumbers);
        playerTwo.setAttempt(0);
    }

    private void printMessage(Player playerOne, Player playerTwo) {
        System.out.print("Числа названные игроком " + playerOne.getName() + ": ");
        for (int number : Arrays.copyOf(playerOne.getNumbers(), playerOne.getAttempt())) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Числа названные игроком " + playerTwo.getName() + ": ");
        for (int number : Arrays.copyOf(playerTwo.getNumbers(), playerTwo.getAttempt())) {
            System.out.print(number + " ");
        }
        System.out.println();
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

        int attemptPlayer = player.getAttempt();

        playerNumbers = player.getNumbers();
        System.out.print("Игрок " + player.getName() + ", введите число от 1 до 100: ");
        int playerNumber = scanner.nextInt();
        playerNumbers[attemptPlayer] = playerNumber;
        player.setNumber(playerNumber);
        player.setNumbers(playerNumbers);
        player.setAttempt(attemptPlayer + 1);

    }
}
