package java_assignment;

public class Question3 {

	public static void main(String[] args) {

		int total = 90;
		int boys = 45;
		int girls = total - boys;
		
		int totalA = total/2;
		int boysA = 20;
		int girlsA = totalA - boysA;
		
		System.out.println("No of girls securing A grade: " + girlsA);
	}
}