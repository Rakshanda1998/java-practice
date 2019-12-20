import java.util.*;

public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Product p = new Product();
		
			System.out.println("Enter the Product Id");
			long id = Integer.parseInt(s.nextLine());
			p.setId(id);
					
			System.out.println("Enter the Product Name");
			p.setProductName(s.nextLine());
			
			System.out.println("Enter the supplier name");
			p.setProductSupplier(s.nextLine());
			
			System.out.println("Product id is : "+p.getId());
			System.out.println("Product Name is : "+p.getProductName());
			System.out.println("Product Supplier is : "+p.getProductSupplier());
		}
}
