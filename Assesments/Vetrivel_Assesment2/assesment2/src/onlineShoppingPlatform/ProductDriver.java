//Class to test Product,Electronic product and Clothing product

package onlineShoppingPlatform;
import java.util.*;

public class ProductDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<ElectronicProduct> electronicProducts = new ArrayList<>();
        List<ClothingProduct> clothingProducts = new ArrayList<>();

        int choice;

        do {
            System.out.println("Choose one choice : ");
            System.out.println("1. Add Electronic Product");
            System.out.println("2. Add Clothing Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Exit\n");
            
            System.out.print("Enter your choice : ");

            choice=sc.nextInt();

            switch(choice){

                case 1:
                	
                    System.out.print("Enter Product Id : ");
                    int productId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    String productName=sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price=sc.nextDouble();

                    System.out.print("Enter Warranty Period (Months) : ");
                    int warranty = sc.nextInt();
                    
                    while(warranty<0) {
                    	System.out.print("Warranty cant be negative Try again : ");
                    	warranty=sc.nextInt();
                    }

                    electronicProducts.add(new ElectronicProduct(productId,productName, price, warranty));
                    System.out.println("Electronic Product Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product ID : ");
                    productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    productName = sc.nextLine();

                    System.out.print("Enter Price : ");
                    price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Size : ");
                    String size = sc.nextLine();

                    System.out.print("Enter Material : ");
                    String material = sc.nextLine();

                    clothingProducts.add(new ClothingProduct(productId, productName, price, size, material));
                    System.out.println("Clothing Product Added Successfully!");
                    break;

                case 3:
                    if(electronicProducts.isEmpty()){
                        System.out.println("No products available.");
                    }
                    else {
                    	
                    	System.out.println("\nElectronic Products : ");
                        for(ElectronicProduct p : electronicProducts) {
                            p.displayInfo();
                        }
                        
                        System.out.println("Clothing Products : ");
                        for(ClothingProduct p : clothingProducts) {
                            p.displayInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

    }
}