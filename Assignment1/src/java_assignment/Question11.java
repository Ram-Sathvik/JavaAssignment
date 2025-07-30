package java_assignment;

import java.util.Scanner;

class Calculator {
	
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public int div(int num1, int num2) {
		return num1 / num2;
	}
}

public class Question11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		
		Calculator calc = new Calculator(num1, num2);
		System.out.println("Addition of two numbers: " + calc.add(num1, num2));
		System.out.println("Subtraction of two numbers: " + calc.sub(num1, num2));
		System.out.println("Multiplication of two numbers: " + calc.mul(num1, num2));
		System.out.println("Division of two numbers: " + calc.div(num1, num2));
	}
}