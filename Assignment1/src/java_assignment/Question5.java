package java_assignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter no.of years of service: ");
		int years = sc.nextInt();
		
		if(years > 6) {
			double bonus = salary * 0.1;
			System.out.println("Your net bonus is: " + bonus);
		}
		else {
			System.out.println("Your net bonus is 0");
		}
	}
}