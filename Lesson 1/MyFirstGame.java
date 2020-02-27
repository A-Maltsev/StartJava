public class MyFirstGame {
	public static void main(String[] args) {
		int number = 20;
		int computerNumber = 20;

		while(number != computerNumber) {
			if (number > computerNumber) {
				System.out.println("Число больше загаданного");
			} else {
				System.out.println("Число меньше загадонного");
			}
		}
		System.out.println("Вы угадали");
	}
}
