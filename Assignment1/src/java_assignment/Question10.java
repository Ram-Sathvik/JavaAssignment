package java_assignment;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of eggs: ");
		int num = sc.nextInt();
		
		int gross = num/144;
		int dozen = (num%144)/12;
		int rem = (num%144)%12;
		
		System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + rem);
	}
}