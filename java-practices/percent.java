import java.util.Scanner;
class percent {
	public static void main(String...agr) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of dozen purchased");
		int x = s.nextInt();
		
		System.out.println("Enter the cost per dozen");
		int y = s.nextInt();
		
		System.out.println("Enter the Selling price of per item");
		int z = s.nextInt();
		
		double costprice=y/12d;
		double profit=z-costprice;
		double profitPer = (profit/costprice)*100;
		
		System.out.println("Sam's profit percentage is " +profitPer+ "percent");		
	}
} 