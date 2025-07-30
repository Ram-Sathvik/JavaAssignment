package java_assignment;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no.of classes held: ");
		int total = sc.nextInt();
		System.out.println("Enter total no.of classes attended: ");
		int attended = sc.nextInt();
		
		float percentage = (float)(attended*100)/total;
		System.out.println("Percentage of classes attended: " + percentage + "%");
		
		if(percentage>70) {
			System.out.println("Allowed for exam");
		}
		else {
			System.out.println("Not allowed for exam");
		}
	}
}