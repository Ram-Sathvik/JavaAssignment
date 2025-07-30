package org.animals;

public class Monkey extends Animal {

	public Monkey(String color, int age, int weight) {
		super(color, age, weight);
	}
	
	public boolean isVegetarian() {
		return true;
	}
	
	public boolean canClimb() {
		return true;
	}
	
	public String sound() {
		return "Chatter";
	}
}