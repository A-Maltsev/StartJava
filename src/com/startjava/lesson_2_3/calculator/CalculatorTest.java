package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String continueCalculate;

		do {
			System.out.println("Введите первое число: ");
			calculator.setFirstNumber(scan.nextInt());

			System.out.println("Введите знак математической операции: ");
			calculator.setOperation(scan.next().charAt(0));

			System.out.println("Введите второе число: ");
			calculator.setSecondNumber(scan.nextInt());

			calculator.calculation();

			while (true) {
				System.out.println("Хотите продолжить? [да/нет]: ");
				continueCalculate = scan.next();
				if (continueCalculate.equals("нет")) break;
				if (continueCalculate.equals("да")) break;
			}
		} while (!continueCalculate.equals("нет"));
	}
}