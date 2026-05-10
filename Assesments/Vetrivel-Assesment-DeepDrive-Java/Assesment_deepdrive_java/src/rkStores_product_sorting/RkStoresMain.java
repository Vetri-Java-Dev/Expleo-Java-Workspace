package rkStores_product_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RkStoresMain {
	
	public static void displayProducts(ArrayList<Product> products) {
		for(Product product : products) {
			System.out.println(product.getProductId()+" | "+product.getProductName()
			+" | "+product.getProductCategory()
			+" | "+product.getProductPrice()
			+" | "+product.getProductDiscount()
			+" | "+product.getProductQuantity());
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Product> products=new ArrayList<>();
		
		products.add(new Product(101,"iphone10","Mobile",20000.0,2,2));
		products.add(new Product(102,"Dell","Laptop",20000.0,3,4));
		products.add(new Product(103,"iphone13","Mobile",10000.0,5,1));
		products.add(new Product(104,"Lenovo","Laptop",70000.0,8,3));
		products.add(new Product(105,"iphone12","Mobile",50000.0,5,6));
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1. Sort by Id");
			System.out.println("2. Sort by Name");
			System.out.println("3. Sort by Price");
			System.out.println("4. Sort by Quantity");
			System.out.println("5. List Mobiles with price more than 40000");
			System.out.println("6. Exit");
			
			System.out.print("Enter the option for sorting : ");
			int choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					Collections.sort(products);
					displayProducts(products);
					break;
					
				case 2:
					Collections.sort(products,new NameComparator());
					displayProducts(products);
					break;
				case 3:
					Collections.sort(products,new PriceComparator());
					displayProducts(products);
					break;
				case 4:
					Collections.sort(products,new QuantityComparator());
					displayProducts(products);
					break;
				case 5:
					for(Product product : products) {
						if(product.getProductPrice()>40000) {
							System.out.println(product.getProductId()+" | "+product.getProductName()
							+" | "+product.getProductCategory()
							+" | "+product.getProductPrice()
							+" | "+product.getProductDiscount()
							+" | "+product.getProductQuantity());
						}
					}
					break;
					
				case 6:
					System.out.print("Thank you !!");
					System.exit(0);
					
				default:
					System.out.print("Invalid input try again.");
			}
			
		}while(true);
		
	}
}
