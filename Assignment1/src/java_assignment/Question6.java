package java_assignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Enter valid marks");
		}
		else if(marks>80) {
			System.out.println("Grade A");
		}
		else if(marks>60) {
			System.out.println("Grade B");
		}
		else if(marks>50) {
			System.out.println("Grade C");
		}
		else if(marks>45) {
			System.out.println("Grade D");
		}
		else if(marks>25) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}
	}
}