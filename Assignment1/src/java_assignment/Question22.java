package java_assignment;

interface Drawable {
	
	void drawingColor();
	void thickness();
}

interface Fillable {
	
	void fillingColor();
	void size();
}

class Line implements Drawable {

	@Override
	public void drawingColor() {
		System.out.println("Drawing black color line");
	}

	@Override
	public void thickness() {
		System.out.println("Line thickness: 2px");
	}
}

class Circle implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Filling blue color in circle");
	}

	@Override
	public void size() {
		System.out.println("Circle radius: 5 units");
	}

	@Override
	public void drawingColor() {
		System.out.println("Drawing red color circle");
	}

	@Override
	public void thickness() {
		System.out.println("Circle thickness: 1px");
	}
}

class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Filling yellow color in square");
	}

	@Override
	public void size() {
		System.out.println("Square side: 4 units");
	}

	@Override
	public void drawingColor() {
		System.out.println("Drawing green color square");
	}

	@Override
	public void thickness() {
		System.out.println("Square thickness: 1px");	
	}
}

public class Question22 {

	public static void main(String[] args) {

		Line line = new Line();
		line.drawingColor();
		line.thickness();
		System.out.println();
		
		Circle circle = new Circle();
		circle.drawingColor();
		circle.thickness();
		circle.fillingColor();
		circle.size();
		System.out.println();
		
		Square square = new Square();
		square.drawingColor();
		square.thickness();
		square.fillingColor();
		square.size();
	}
}