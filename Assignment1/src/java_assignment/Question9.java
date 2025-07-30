package java_assignment;

import java.util.Scanner;

class Product9 {
	
	private int pno;
	private double price;
	
	public Product9(int pno, double price) {
		this.pno = pno;
		this.price = price;
	}

	public int getPno() {
		return pno;
	}

	public double getPrice() {
		return price;
	}
}

public class Question9 {

	public static void main(String[] args) {

		Product9 p1 = new Product9(1, 22.50);
		Product9 p2 = new Product9(2, 44.50);
		Product9 p3 = new Product9(3, 9.98);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter quantity sold of product " + num + ": ");
		int quan = sc.nextInt();
		
		switch(num) {
			
			case 1: {
				double total = quan * p1.getPrice();
				System.out.println("Total retail price of Product 1: " + total);
				break;
			}
			
			case 2: {
				double total = quan * p2.getPrice();
				System.out.println("Total retail price of Product 2: " + total);
				break;
			}

			case 3: {
				double total = quan * p3.getPrice();
				System.out.println("Total retail price of Product 3: " + total);
				break;
			}
			
			default: System.out.println("Invalid product number");
		}
	}
}