package java_assignment;

abstract class Vehicle20 {
	
	abstract void start();
	abstract void stop();
}

class Bike20 extends Vehicle20 {

	@Override
	void start() {
		System.out.println("Bike started");
	}

	@Override
	void stop() {
		System.out.println("Bike stopped");
	}
}

class Car20 extends Vehicle20 {
	
	@Override
	void start() {
		System.out.println("Car started");
	}
	
	@Override
	void stop() {
		System.out.println("Car stopped");
	}
}

public class VehicleDriver20 {

	public static void main(String[] args) {
		
		Vehicle20 bike = new Bike20();
		bike.start();
		bike.stop();
		
		Vehicle20 car = new Car20();
		car.start();
		car.stop();
	}
}