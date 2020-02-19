public class ConditionalStatement {
	public static void main(String[] args) {
		short age = 25;
		if (age > 20) {
			System.out.println("Ваш возраст - " + age + ". Это больше 20");
		}

		boolean isMale = true;
		if (isMale == true) {
			System.out.println("Вы мужчина");
		}

		boolean isMale1 = false;
		if (isMale1 == false) {
			System.out.println("Вы женщина");
		}

		float height = 1.75f;
		if (height < 1.80f) {
			System.out.println("Ваш рост - " + height + ". Это меньше 1.80");
		} else {
			System.out.println("Ваш рост - " + height + ". Это больше 1.80");
		}

		float height1 = 1.90f;
		if (height1 < 1.80f) {
			System.out.println("Ваш рост - " + height1 + ". Это меньше 1.80");
		} else {
			System.out.println("Ваш рост - " + height1 + ". Это больше 1.80");
		}


		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("Ваше имя начинается с M");
		} else if (firstNameLetter == 'I') {
			System.out.println("Ваше имя начинается с I");
		} else {
			System.out.println("Ваше имя ничинается с буквы " + firstNameLetter);
		}

		char firstNameLetter1 = 'I';
		if (firstNameLetter1 == 'M') {
			System.out.println("Ваше имя начинается с М");
		} else if (firstNameLetter1 == 'I') {
			System.out.println("Ваше имя начинается с I");
		} else {
			System.out.println("Ваше имя ничинается с буквы " + firstNameLetter1);
		}

		char firstNameLetter2 = 'D';
		if (firstNameLetter2 == 'M') {
			System.out.println("Ваше имя начинается с М");
		} else if (firstNameLetter2 == 'I') {
			System.out.println("Ваше имя начинается с I");
		} else {
			System.out.println("Ваше имя ничинается с буквы " + firstNameLetter2);
		}

	}
}