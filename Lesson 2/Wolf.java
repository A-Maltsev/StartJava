public class Wolf {
	
	private String sex;
	private String name;
	private int weight;
	private int age;
	private String color;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void walk() {
		System.out.println("Волк идет");
	}

	public boolean isSit() {
		return false;
	}

	public String run() {
		return "Волк пробежал 5 километров";
	}

	public boolean isHowl() {
		return false;
	}

	public int hunt() {
		return 5;
	}

}