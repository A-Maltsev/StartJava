package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

	public void calculation(String mathExpression) {
		String[] splitMathExpression = mathExpression.split(" ");

		switch(splitMathExpression[1].charAt(0)) {
			case '+':
				System.out.println("Результат: " + (Integer.parseInt(splitMathExpression[0]) + Integer.parseInt(splitMathExpression[2])));
				break;
			case '-':
				System.out.println("Результат: " + (Integer.parseInt(splitMathExpression[0]) - Integer.parseInt(splitMathExpression[2])));
				break;
			case '*':
				System.out.println("Результат: " + (Integer.parseInt(splitMathExpression[0]) * Integer.parseInt(splitMathExpression[2])));
				break;
			case '/':
				System.out.println("Результат: " + (Integer.parseInt(splitMathExpression[0]) / Integer.parseInt(splitMathExpression[2])));
				break;
			case '^':
				System.out.println("Результат: " + Math.pow(Integer.parseInt(splitMathExpression[0]), Integer.parseInt(splitMathExpression[2])));
				break;
			case '%':
				System.out.println("Результат: " + (Integer.parseInt(splitMathExpression[0]) % Integer.parseInt(splitMathExpression[2])));
				break;
			default:
				System.out.println("Не верный знак математической операции.");
		}
	}

}
