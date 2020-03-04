public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.sex = "Male";
		wolfOne.name  = "Bio wolf";
		wolfOne.weight = 50;
		wolfOne.age = 6;
		wolfOne.color = "Dark grey";

		System.out.println("Пол волка - " + wolfOne.sex);
		System.out.println("Волка зовут - " + wolfOne.name);
		System.out.println("Вес волка - " + wolfOne.weight);
		System.out.println("Возраст волка - " + wolfOne.age + " лет.");
		System.out.println("Цвет волка - " + wolfOne.color);

		wolfOne.walk();
		System.out.println("Волк сидит? " + wolfOne.isSit());
		System.out.println(wolfOne.run());
		System.out.println("Волк воет? " + wolfOne.isHowl());
		System.out.println("Волк поймал " + wolfOne.hunt() + " зайцев.");
	}
}