import java.util.Scanner;

public class Shape {
	protected static String shapeName;

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	public static String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	} 
	
	public double calculateArea() {
	return(0.0);

	}
}