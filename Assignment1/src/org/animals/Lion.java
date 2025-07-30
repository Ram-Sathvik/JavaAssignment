package org.animals;

public class Lion extends Animal {

	public Lion(String color, int age, int weight) {
		super(color, age, weight);
	}
	
	public String sound() {
		return "Roar";
	}
}
