
public class Product {
	
	private long Id;
	private String ProductName;
	private String ProductSupplier;
	
	public long getId() 
	{
		return Id;
	}
	
	public String getProductName()
	{
		return ProductName;
	}
	
	public String getProductSupplier() 
	{
		return ProductSupplier;
	}
	
	public void setId(long id)
	{
		this.Id = id;       
	}
	
	public void setProductName(String ProductName)
	{
		this.ProductName = ProductName;
	}
	
	public void setProductSupplier(String ProductSupplier) {
		this.ProductSupplier = ProductSupplier;
	}	
}