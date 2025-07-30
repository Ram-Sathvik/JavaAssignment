package java_assignment;

class Vehicle17 {
	
	String brand;
	String color;
	int noOfWheels;
	
	public Vehicle17(String brand, String color, int noOfWheels) {
		this.brand = brand;
		this.color = color;
		this.noOfWheels = noOfWheels;
	}
	
	public void displayDetails() {
		System.out.println("Brand: " + brand + ", Color: " + color + ", No.of Wheels: " + noOfWheels);
	}
	
	public void start() {
		System.out.println("Starting " + brand);
	}
	
	public void stop() {
		System.out.println("Stopping " + brand);
	}
}

class Bike extends Vehicle17 {
	
	public Bike(String brand, String color, int noOfWheels) {
		super(brand, color, noOfWheels);
	}
	
	public void kickStart() {
		System.out.println("Kick starting " + brand);
	}
}

class Car extends Vehicle17 {
	
	public Car(String brand, String color, int noOfWheels) {
		super(brand, color, noOfWheels);
	}
	
	public void playMusic() {
		System.out.println("Playing music in " + brand);
	}
}

class Truck extends Vehicle17 {
	
	public Truck(String brand, String color, int noOfWheels) {
		super(brand, color, noOfWheels);
	}
	
	public void transportGoods() {
		System.out.println("Transporting goods in " + brand);
	}
}

public class Road17 {

	public static void main(String[] args) {

		Bike bike = new Bike("Kawasaki", "Black", 2);
		bike.displayDetails();
		bike.start();
		bike.kickStart();
		bike.stop();
		System.out.println();
		
		Car car = new Car("Porsche", "Red", 4);
		car.displayDetails();
		car.start();
		car.playMusic();
		car.stop();
		System.out.println();
		
		Truck truck = new Truck("Volvo", "Brown", 8);
		truck.displayDetails();
		truck.start();
		truck.transportGoods();
		truck.stop();
	}
}