
public class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI *radius * radius;
	}

}
