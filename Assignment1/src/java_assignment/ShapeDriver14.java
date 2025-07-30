package java_assignment;

class Shape {
	
	public int area(int side) {
		return side * side;
	}
	
	public int area(int length, int breadth) {
		return length * breadth;
	}
	
	public int perimeter(int side) {
		return 4 * side;
	}
	
	public int perimeter(int length, int breadth) {
		return 2 * (length + breadth);
	}
}

public class ShapeDriver14 {

	public static void main(String[] args) {

		Shape shape = new Shape();
		System.out.println("Area of square of side 10: " + shape.area(10));
		System.out.println("Area of rectangle of sides 10, 20: " + shape.area(10, 20));
		System.out.println("Perimeter of square of side 10: " + shape.perimeter(10));
		System.out.println("Perimeter of rectangle of sides 10, 20: " + shape.perimeter(10, 20));
	}
}