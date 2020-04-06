package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("2015", "Mark-1", "Destroyed", "Russia", 85.34f, 2.412f, 3, 10, 10);

		System.out.println("Jaeger One Launched - " + jaegerOne.getLaunched());
		System.out.println("Jaeger One Mark - " + jaegerOne.getMark());
		System.out.println("Jaeger One Status - " + jaegerOne.getStatus());
		System.out.println("Jaeger One Origin - " + jaegerOne.getOrigin());
		System.out.println("Jaeger One Height - " + jaegerOne.getHeight());
		System.out.println("Jaeger One Weight - " + jaegerOne.getWeight());
		System.out.println("Jaeger One Speed - " + jaegerOne.getSpeed());
		System.out.println("Jaeger One Strength - " + jaegerOne.getStrength());
		System.out.println("Jaeger One Armor - " + jaegerOne.getArmor());

		jaegerOne.setSpeed(5);
		System.out.println("Jaeger One Change Speed - " + jaegerOne.getSpeed());
		jaegerOne.setStrength(15);
		System.out.println("Jaeger One Change Strength - " + jaegerOne.getStrength());

		Jaeger jaegerTwo = new Jaeger("December 6, 2015", "Mark-1", "Destroyed", "Japan", 74.37f, 7.450f, 8, 7, 3);

		System.out.println("Jaeger Two Launched - " + jaegerTwo.getLaunched());
		System.out.println("Jaeger Two Mark - " + jaegerTwo.getMark());
		System.out.println("Jaeger Two Status - " + jaegerTwo.getStatus());
		System.out.println("Jaeger Two Origin - " + jaegerTwo.getOrigin());
		System.out.println("Jaeger Two Height - " + jaegerTwo.getHeight());
		System.out.println("Jaeger Two Weight - " + jaegerTwo.getWeight());
		System.out.println("Jaeger Two Speed - " + jaegerTwo.getSpeed());
		System.out.println("Jaeger Two Strength - " + jaegerTwo.getStrength());
		System.out.println("Jaeger Two Armor - " + jaegerTwo.getArmor());

		jaegerTwo.setStrength(10);
		System.out.println("Jaeger Two Change Strength - " + jaegerTwo.getStrength());
		jaegerTwo.setArmor(5);
		System.out.println("Jaeger Two Change Armor - " + jaegerTwo.getArmor());
	}
}