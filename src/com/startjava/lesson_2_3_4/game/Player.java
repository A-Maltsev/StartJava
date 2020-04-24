package com.startjava.lesson_2_3_4.game;

public class Player {
	private final String name;
	private int number;
	private int[] numbers;
	private int attempt;

	public Player(String name, int[] numbers, int attempt) {
		this.name = name;
		this.numbers = numbers;
		this.attempt = attempt;
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
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public int getAttempt() {
		return attempt;
	}
}
