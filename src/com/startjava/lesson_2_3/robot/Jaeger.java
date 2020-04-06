package com.startjava.lesson_2_3.robot;

public class Jaeger {

	private String launched;
	private String mark;
	private String status;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String launched, String mark, String status, String origin, float height, float weight, int speed, int strength, int armor) {
		this.launched = launched;
		this.mark = mark;
		this.status = status;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getLaunched() {
		return launched;
	}

	public String getMark() {
		return mark;
	}

	public String getStatus() {
		return status;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
}
