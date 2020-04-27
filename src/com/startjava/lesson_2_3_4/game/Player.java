package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private final String name;
	private int number;
	private final int[] numbers = new int[10];
	private int attempt = 0;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, this.attempt);
	}

	public void setPlayerNumbers(int numbers) {
		this.numbers[attempt] = numbers;
	}

	public void fillNumbers() {
		Arrays.fill(this.numbers, 0, this.attempt, 0);
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public int getAttempt() {
		return attempt;
	}
}
