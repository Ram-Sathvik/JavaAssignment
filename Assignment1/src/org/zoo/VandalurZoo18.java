package org.zoo;

import org.animals.Deer;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

public class VandalurZoo18 {

	public static void main(String[] args) {

		Lion lion = new Lion("Gold", 8, 180);
		lion.displayDetails();
		System.out.println();
		
		Tiger tiger = new Tiger("Orange and black stripes", 6, 150);
		tiger.displayDetails();
		System.out.println();
		
		Deer deer = new Deer("Brown", 4, 90);
		deer.displayDetails();
		System.out.println();
		
		Monkey monkey = new Monkey("Grey", 5, 40);
		monkey.displayDetails();
		System.out.println();
	}
}