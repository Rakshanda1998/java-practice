import java.util.*;
class Profitmethod {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased");
		int x = Integer.parseInt(s.nextLine());

		System.out.println("Entyer the price per dozen");
		int y = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter the selling price of 1 toy");
		int z = Integer.parseInt(s.nextLine());
		
		Profitmethod2 pm = new Profitmethod2();
		float profit = pm.calculateProfit(x, y, z);
		
		System.out.printf("Sam's profit percentage is %.2f " ,profit, " percent");
	}
}