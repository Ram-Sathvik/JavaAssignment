package java_assignment;

import java.util.Scanner;

public class Question8 {

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
			System.out.println("Do you have any medical cause? Enter 'Y' or 'N'");
			char ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y') {
				System.out.println("Allowed for exam");
			}
			else if(ch == 'N' || ch == 'n'){				
				System.out.println("Not allowed for exam");
			}
		}
	}

}
