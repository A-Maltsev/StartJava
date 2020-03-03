public class MyFirstGame {
	public static void main(String[] args) {
		int number = 10;
		int computerNumber = 20;

		while(number != computerNumber) {
			if (number > computerNumber) {
				number--;
				System.out.println("Число больше загаданного");
			} else {
				number++;
				System.out.println("Число меньше загадонного");
			}
		}
		System.out.println("Вы угадали");
	}
}