package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setSex("Male");
		wolfOne.setName("Bio wolf");
		wolfOne.setWeight(50);
		wolfOne.setAge(6);
		wolfOne.setColor("Dark grey");


		System.out.println("Пол волка - " + wolfOne.getSex());
		System.out.println("Волка зовут - " + wolfOne.getName());
		System.out.println("Вес волка - " + wolfOne.getWeight());
		System.out.println("Возраст волка - " + wolfOne.getAge() + " лет.");
		wolfOne.setAge(9);
		System.out.println("Цвет волка - " + wolfOne.getColor());

		wolfOne.walk();
		System.out.println("Волк сидит? " + wolfOne.isSit());
		System.out.println(wolfOne.run());
		System.out.println("Волк воет? " + wolfOne.isHowl());
		System.out.println("Волк поймал " + wolfOne.hunt() + " зайцев.");
	}
}
