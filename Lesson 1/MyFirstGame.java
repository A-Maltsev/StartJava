public class MyFirstGame {
	public static void main(String[] args) {
		boolean isGuess = false;
		int number = 60;
		int computerNumber = 20;

		do {
			if (number > computerNumber) {
				System.out.println("Число больше загаданного");
			} else if (number < computerNumber) {
				System.out.println("Число меньше загадонного");
			} else {
				System.out.println("Вы угадали");
				isGuess = true;
			}
		} while(!isGuess);
	}
}