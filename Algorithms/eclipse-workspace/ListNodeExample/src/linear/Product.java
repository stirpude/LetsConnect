package linear;

public class Product {
	
	private String productName;
	
	
	public String getProductName() {
		return productName;
	}
	public Product(String productName, int productQuantity) {
		
		this.productName = productName;
		this.productQuantity = productQuantity;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	private int productQuantity;
	
	@Override
	public String toString() {
		return "Product{" + "name =" + productName + productQuantity;
	}
	
	

}
