package java_assignment;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int speeds[] = new int[5];
		
		System.out.println("Enter speed of racer-1: ");
		speeds[0] = sc.nextInt();
		
		System.out.println("Enter speed of racer-2: ");
		speeds[1] = sc.nextInt();
		
		System.out.println("Enter speed of racer-3: ");
		speeds[2] = sc.nextInt();
		
		System.out.println("Enter speed of racer-4: ");
		speeds[3] = sc.nextInt();
		
		System.out.println("Enter speed of racer-5: ");
		speeds[4] = sc.nextInt();
		
		float avg = 0;
		for(int speed: speeds)
			avg += speed;
		avg /= 5;
		
		for(int speed: speeds) {
			if(speed > avg)
				System.out.println(speed);
		}
	}
}