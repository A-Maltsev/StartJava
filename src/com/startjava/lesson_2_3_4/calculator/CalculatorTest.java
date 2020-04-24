package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String continueCalculate;

		do {
			System.out.print("Введите математическое выражение: ");
			String mathExpression = scan.nextLine();

			String[] massMathExpression = mathExpression.split(" ");

			calculator.setFirstNumber(Integer.parseInt(massMathExpression[0]));
			calculator.setOperation(massMathExpression[1].charAt(0));
			calculator.setSecondNumber(Integer.parseInt(massMathExpression[2]));

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
