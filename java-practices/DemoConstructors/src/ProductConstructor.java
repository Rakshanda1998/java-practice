import java.io.*;
import java.util.Scanner;
public class ProductConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		ProductCo p = new ProductCo();
		
		System.out.println("Enter the Product Id : ");
		long id = Long.parseLong(s.nextLine());
		p.setId = id;
		
		System.out.println("Enter the Product Name");
		p.setProductName(s.nextLine());
		
		System.out.println("Enter the Supplier Name");
		p.setProductSupplier(s.nextLine());
		
		System.out.println("Product Id is : "+p.getId());
		System.out.println("Product Name is : "+p.getProductName());
		System.out.println("")
		
		
	}

}
