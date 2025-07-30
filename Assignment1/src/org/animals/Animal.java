package org.animals;

public class Animal {

	String color;
	int age;
	int weight;

	public Animal(String color, int age, int weight) {
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	
	public boolean isVegetarian() {
		return false;
	}
	
	public boolean canClimb() {
		return false;
	}
	
	public String sound() {
		return "Animal sound";
	}
	
	public void displayDetails() {
		System.out.println("Color: " + color + ", Age: " + age + ", Weight: " + weight);
		System.out.println("Vegetarian: " + isVegetarian());
		System.out.println("Can climb: " + canClimb());
		System.out.println("Sound: " + sound());
	}
}