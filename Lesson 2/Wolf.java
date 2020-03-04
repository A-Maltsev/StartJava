public class Wolf {
	
	String sex;
	String name;
	int weight;
	int age;
	String color;

	void walk() {
		System.out.println("Волк идет");
	}

	boolean isSit() {
		return false;
	}

	String run() {
		return "Волк пробежал 5 километров";
	}

	boolean isHowl() {
		return false;
	}

	int hunt() {
		return 5;
	}

}