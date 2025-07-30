package org.animals;

public class Tiger extends Animal {

	public Tiger(String color, int age, int weight) {
		super(color, age, weight);
	}
	
	public String sound() {
		return "Growl";
	}
}