package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
	private char operation;
	private int firstNumber;
	private int secondNumber;

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getOperation() {
		return operation;
	}

	public void calculation() {
		switch(operation) {
			case '+':
				System.out.println("Результат: " + (firstNumber + secondNumber));
				break;
			case '-':
				System.out.println("Результат: " + (firstNumber - secondNumber));
				break;
			case '*':
				System.out.println("Результат: " + (firstNumber * secondNumber));
				break;
			case '/':
				System.out.println("Результат: " + (firstNumber / secondNumber));
				break;
			case '^':
				System.out.println("Результат: " + Math.pow(firstNumber, secondNumber));
				break;
			case '%':
				System.out.println("Результат: " + (firstNumber % secondNumber));
				break;
			default:
				System.out.println("Не верный знак математической операции.");
		}
	}

}
