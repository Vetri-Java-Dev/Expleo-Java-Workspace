package rkStores_product_sorting;

import java.util.Comparator;

//productid, productName, productCategory, productPrice,
//productDiscount and productQuantity

public class Product implements Comparable<Product>{
	
	private int productId;
	private String productName;
	private String productCategory;
	private double productPrice;
	private double productDiscount;
	private int productQuantity;
	
	
	
	public Product(int productId, String productName, String productCategory, double productPrice,
			double productDiscount, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	//default sorting on package id
	@Override
	public int compareTo(Product o) {
		return this.productId-o.getProductId();
	}
	
	
}
