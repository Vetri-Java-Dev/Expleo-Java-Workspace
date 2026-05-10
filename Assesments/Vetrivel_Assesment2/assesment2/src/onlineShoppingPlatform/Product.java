package onlineShoppingPlatform;

abstract class Product {
	
	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	//getters
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
	
	//abstract method
	abstract void displayInfo();
	
	
}
