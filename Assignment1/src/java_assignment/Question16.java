package java_assignment;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student-1 marks (0-100): ");
		int marks1 = sc.nextInt();
		while(marks1<0 || marks1>100) {
			System.out.println("Invalid input, try again");
			System.out.println("Enter Student-1 marks (0-100): ");
			marks1 = sc.nextInt();
		}
		
		System.out.println("Enter Student-2 marks (0-100): ");
		int marks2 = sc.nextInt();
		while(marks2<0 || marks2>100) {
			System.out.println("Invalid input, try again");
			System.out.println("Enter Student-2 marks (0-100): ");
			marks2 = sc.nextInt();
		}
		
		System.out.println("Enter Student-3 marks (0-100): ");
		int marks3 = sc.nextInt();
		while(marks3<0 || marks3>100) {
			System.out.println("Invalid input, try again");
			System.out.println("Enter Student-3 marks (0-100): ");
			marks3 = sc.nextInt();
		}
		
		System.out.printf("Average: %.2f", (float)(marks1 + marks2 + marks3)/3);
	}
}