package java_assignment;

class DailyWorker13 extends Worker13 {
	
	public DailyWorker13(String name, double salaryRate) {
		super(name, salaryRate);
	}
	
	public double pay(int hours) {
		int daysWorked = hours/8;
		return daysWorked * salaryRate;
	}
}

class SalariedWorker13 extends DailyWorker13 {
	
	public SalariedWorker13(String name, double salaryRate) {
		super(name, salaryRate);
	}
	
	public double pay(int hours) {
		return 40 * salaryRate;
	}
}

class Worker13 {

	String name;
	double salaryRate;
	
	public Worker13(String name, double salaryRate) {
		this.name = name;
		this.salaryRate= salaryRate;
	}
	
	public double pay(int hours) {
		return 0.0;
	}
}

public class WorkerDriver13 {
	
	public static void main(String[] args) {
		
		DailyWorker13 dw = new DailyWorker13("Karan", 2000);
		System.out.println(dw.pay(40));
		System.out.println(dw.pay(32));
		
		SalariedWorker13 sw = new SalariedWorker13("Rohan", 400);
		System.out.println(sw.pay(40));
		System.out.println(sw.pay(32));
	}
}