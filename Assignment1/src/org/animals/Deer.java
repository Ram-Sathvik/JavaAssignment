package org.animals;

public class Deer extends Animal {

	public Deer(String color, int age, int weight) {
		super(color, age, weight);
	}
	
	public boolean isVegetarian() {
		return true;
	}
	
	public String sound() {
		return "Bleat";
	}
}