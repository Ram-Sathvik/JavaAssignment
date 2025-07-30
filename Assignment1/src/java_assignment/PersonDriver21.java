package java_assignment;

abstract class Person21 {
	
	abstract void eat();
	abstract void exercise();
}

class Athlete21 extends Person21 {
	
	@Override
	void eat() {
		System.out.println("Eat healthy food");
	}
	
	@Override
	void exercise() {
		System.out.println("Exercise for 3 hours daily");
	}
}

class LazyPerson21 extends Person21 {

	@Override
	void eat() {
		System.out.println("Eat junk food");
	}

	@Override
	void exercise() {
		System.out.println("Sit at home lazily");
	}
	
}

public class PersonDriver21 {

	public static void main(String[] args) {

		Person21 athlete = new Athlete21();
		athlete.eat();
		athlete.exercise();
		System.out.println();
		
		Person21 lazy = new LazyPerson21();
		lazy.eat();
		lazy.exercise();
	}
}