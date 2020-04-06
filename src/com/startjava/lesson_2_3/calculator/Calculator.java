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
				int result = 1;	
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println("Результат: " + result);	
				break;
			case '%':
				System.out.println("Результат: " + (firstNumber % secondNumber));
				break;	
			default:
				System.out.println("Не верный знак математической операции.");		
		}
	}

}