
public class ProductConstr {
	private long id;
	private String productName;
	private String supplierName;


	public ProductConstr(int Id, String Pname, String Sname) {
		// TODO Auto-generated constructor stub
		this.id = Id;
		this.productName = Pname;
		this.supplierName = Sname;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String Pname) {
		this.productName = productName;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public void setSupplierName(String Sname) {
		this.supplierName = supplierName;
	}
	
	public void setid(long Id) {
		this.id = Id;
	}
	
	public long getId() {
		return id;
	}
	
	public void display() {
		System.out.println("Product id is "+getId());
		
		System.out.println("Product Name is "+getProductName());
		
		System.out.println("Supplier Name is "+getSupplierName());
	}
}
