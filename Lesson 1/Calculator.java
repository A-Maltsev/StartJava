public class Calculator {
	public static void main(String[] args) {
		char operation = '%';
		int firstNumber = 4;
		int secondNumber = 3;

		int result = firstNumber;
		if (operation == '+') {
			result += secondNumber;
			System.out.println(result);
		} else if (operation == '-') {
			result -= secondNumber;
			System.out.println(result);
		} else if (operation == '*') {
			result *= secondNumber;
			System.out.println(result);
		} else if (operation == '/') {
			float resultDivision;
			resultDivision = firstNumber / secondNumber;
			System.out.println(resultDivision);
		} else if (operation == '^') {
			for (int i = 2; i <= secondNumber; i++) {
				result = result * firstNumber;
			}
			System.out.println(result);
		} else {
			result %= secondNumber;
			System.out.println(result);
		}
	}
}