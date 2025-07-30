package java_assignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your roll no: ");
		int rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your field of interest: ");
		String field = sc.nextLine();
		
		System.out.println("Hey, my name is " + name + " and my roll number is " + rollno + ". My field of interest is " + field);
	}
}