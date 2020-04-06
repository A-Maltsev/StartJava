public class Person {
	
	String name = "Anton";
	String sex = "Male";
	float height = 1.75f;
	int weight = 80; 
	int age = 41;
	
	void walk() {
		System.out.println("Вы идете");
	}

	boolean isSit() {
		return false;
	}

	void run() {
		System.out.println("Вы пробежали 5 км.");
	}

	String speak() {
		return "Java";
	}

	boolean isLearnJava() {
		return true;
	}
}
