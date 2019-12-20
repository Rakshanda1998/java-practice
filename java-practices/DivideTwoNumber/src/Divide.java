import java.awt.AWTException;
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		try {

			Scanner s = new Scanner(System.in);

			System.out.println("Enter 2 Numbers");
			int a = Integer.parseInt(s.nextLine());
			int b = Integer.parseInt(s.nextLine());
			int c = a / b;
			System.out.println("The quotient of " + a + "/" + b + " = " + c);
		} catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		} finally {
			System.out.println("Inside finally block");
		}

	}

}