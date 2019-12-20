import java.util.Scanner;

public class ProductConsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			
		ProductConstr pc = new ProductConstr(1, "Printer", "Hp");
		
		System.out.println("Enter the Product id ");
		long Id = Long.parseLong(s.nextLine());
				
		System.out.println("Enter the Product Name ");
		String Pname = s.nextLine();
		pc.setProductName(Pname);
		
		System.out.println("Enter the Supplier Name ");
		String Sname = s.nextLine();
		pc.setSupplierName(Sname);
		
		pc.display();
	}
}
