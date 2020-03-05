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

			System.out.println("Хотите продолжить? [да/нет]: ");
			continueCalculate = scan.next();

		} while (continueCalculate != "нет");

	}
}