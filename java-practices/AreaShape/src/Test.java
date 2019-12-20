import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		System.out.print("Area calculator --- Choose your shape ");
		int choice = Integer.parseInt(s.nextLine());
		Shape shape = null;

		if (choice == 1) {
			System.out.print("Enter length : ");
			int length = Integer.parseInt(s.nextLine());
			System.out.print("Enter breadth: ");
			int breadth = Integer.parseInt(s.nextLine());
			shape = new Rectangle(length, breadth);
		} else if (choice == 2) {
			System.out.print("Enter side: ");
			int side = Integer.parseInt(s.nextLine());
			shape = new Square(side);
		}
		else if(choice == 3) {
			System.out.print("Enter Radius: ");
		    int radius = Integer.parseInt(s.nextLine());
		    shape = new Circle(radius);
		}
		System.out.printf("Area of %s is : %.2f" ,Shape.getShapeName(), shape.calculateArea());
	}
}