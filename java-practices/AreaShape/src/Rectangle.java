public class Rectangle extends Shape {
	private int length, breadth;

	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea() {
		 return length * breadth;
	}

}
