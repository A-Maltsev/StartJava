package com.startjava.lesson_1.conditional_statement;

public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 25;
		if (age > 20) {
			System.out.println("Ваш возраст - " + age + ". Это больше 20");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println("Вы мужчина");
		}

		if (!isMale) {
			System.out.println("Вы женщина");
		}

		float height = 1.75f;
		if (height < 1.80f) {
			System.out.println("Ваш рост - " + height + ". Это меньше 1.80");
		} else {
			System.out.println("Ваш рост - " + height + ". Это больше 1.80");
		}

		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("Ваше имя начинается с M");
		} else if (firstNameLetter == 'I') {
			System.out.println("Ваше имя начинается с I");
		} else {
			System.out.println("Ваше имя ничинается с буквы " + firstNameLetter);
		}

	}
}