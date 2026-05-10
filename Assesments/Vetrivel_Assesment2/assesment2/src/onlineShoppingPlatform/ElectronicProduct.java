package onlineShoppingPlatform;

public class ElectronicProduct extends Product{

	private int warrantyPeriod;
	
	public ElectronicProduct(int productId, String productName, double price,int warrantyPeriod) {
		super(productId, productName, price);
		this.warrantyPeriod=warrantyPeriod;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	@Override
	public void displayInfo() {
	    System.out.println("\nProductId : " + getProductId());
	    System.out.println("ProductName : " + getProductName());
	    System.out.println("Price : $" + getPrice());
	    System.out.println("Warranty Period : " + warrantyPeriod + " Months\n");
	}

}
