public class JaegerTest{
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		Jaeger jaegerTwo = new Jaeger();

		jaegerOne.setLaunched("2015");
		jaegerOne.setMark("Mark-1");
		jaegerOne.setStatus("Destroyed");
		jaegerOne.setOrigin("Russia");
		jaegerOne.setHeight(85.34f);
		jaegerOne.setWeight(2.412f);
		jaegerOne.setSpeed(3);
		jaegerOne.setStrength(10);
		jaegerOne.setArmor(10);

		jaegerTwo.setLaunched("December 6, 2015");
		jaegerTwo.setMark("Mark-1");
		jaegerTwo.setStatus("Destroyed");
		jaegerTwo.setOrigin("Japan");
		jaegerTwo.setHeight(74.37f);
		jaegerTwo.setWeight(7.450f);
		jaegerTwo.setSpeed(8);
		jaegerTwo.setStrength(7);
		jaegerTwo.setArmor(3);

		System.out.println("Jaeger One Launched - " + jaegerOne.getLaunched());
		System.out.println("Jaeger One Mark - " + jaegerOne.getMark());
		System.out.println("Jaeger One Status - " + jaegerOne.getStatus());
		System.out.println("Jaeger One Origin - " + jaegerOne.getOrigin());
		System.out.println("Jaeger One Height - " + jaegerOne.getHeight());
		System.out.println("Jaeger One Weight - " + jaegerOne.getWeight());
		System.out.println("Jaeger One Speed - " + jaegerOne.getSpeed());
		System.out.println("Jaeger One Strength - " + jaegerOne.getStrength());
		System.out.println("Jaeger One Armor - " + jaegerOne.getArmor());

		System.out.println("Jaeger Two Launched - " + jaegerTwo.getLaunched());
		System.out.println("Jaeger Two Mark - " + jaegerTwo.getMark());
		System.out.println("Jaeger Two Status - " + jaegerTwo.getStatus());
		System.out.println("Jaeger Two Origin - " + jaegerTwo.getOrigin());
		System.out.println("Jaeger Two Height - " + jaegerTwo.getHeight());
		System.out.println("Jaeger Two Weight - " + jaegerTwo.getWeight());
		System.out.println("Jaeger Two Speed - " + jaegerTwo.getSpeed());
		System.out.println("Jaeger Two Strength - " + jaegerTwo.getStrength());
		System.out.println("Jaeger Two Armor - " + jaegerTwo.getArmor());
	}
}