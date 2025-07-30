package java_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student12 {

	private int rollno;
	private String name;
	private int marksEng;
	private int marksMaths;
	private int marksScience;
	
	private static int count = 1;
	
	public Student12(String name, int marksEng, int marksMaths, int marksScience) {
		this.rollno = count++;
		this.name = name;
		this.marksEng = marksEng;
		this.marksMaths = marksMaths;
		this.marksScience = marksScience;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarksEng() {
		return marksEng;
	}

	public void setMarksEng(int marksEng) {
		this.marksEng = marksEng;
	}

	public int getMarksMaths() {
		return marksMaths;
	}

	public void setMarksMaths(int marksMaths) {
		this.marksMaths = marksMaths;
	}

	public int getMarksScience() {
		return marksScience;
	}

	public void setMarksScience(int marksScience) {
		this.marksScience = marksScience;
	}
	
	public int getTotalMarks() {
		return marksEng + marksMaths + marksScience;
	}
	
	public double getPercentage() {
		return (double)getTotalMarks()/3;
	}
}

public class Standard12 {

	ArrayList<Student12> students = new ArrayList<Student12>();
	
	public Standard12() {
		students.add(new Student12("John", 85, 90, 92));
        students.add(new Student12("Alice", 88, 95, 91));
        students.add(new Student12("Bob", 75, 80, 85));
        students.add(new Student12("Eva", 78, 85, 89));
        students.add(new Student12("Tom", 92, 88, 94));
        students.add(new Student12("Sara", 80, 78, 85));
        students.add(new Student12("Megan", 70, 78, 82));
        students.add(new Student12("James", 95, 96, 97));
	}
	
	public void displayAscRollno() {
		students.sort(Comparator.comparing(Student12::getRollno));
		for(Student12 student: students) {
			System.out.println("Rollno: " + student.getRollno() + " Name: " + student.getName());
		}
	}
	
	public void displayHighestPercentage() {
		Student12 max = Collections.max(students, Comparator.comparingInt(Student12::getTotalMarks));
		System.out.println("Student with highest percentage is Rollno: " + max.getRollno() + " Name: " + max.getName());
	}
	
	public void displayHighestMarksEnglish() {
		Student12 maxEng = Collections.max(students, Comparator.comparingInt(Student12::getMarksEng));
		System.out.println("Student with highest marks in English is Rollno: " + maxEng.getRollno() + " Name: " + maxEng.getName());
	}
	
	public void displayHighestMarksMathsScience() {
		students.sort(Comparator.comparingInt(stud -> stud.getMarksMaths() + stud.getMarksScience()));
		for(Student12 student: students) {
			System.out.println("Rollno: " + student.getRollno() + " Name: " + student.getName());
		}
	}
	
	public void displayDescRank() {
		students.sort(Comparator.comparingDouble(Student12::getPercentage));
		for(Student12 student: students) {
			System.out.println("Rollno: " + student.getRollno() + " Name: " + student.getName());
		}
	}
	
	public static void main(String[] args) {
        
		Standard12 standard = new Standard12();
		standard.displayAscRollno();
		standard.displayHighestPercentage();
		standard.displayHighestMarksEnglish();
		standard.displayHighestMarksMathsScience();
		standard.displayDescRank();
	}
}