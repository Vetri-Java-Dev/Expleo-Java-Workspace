package rkStores_product_sorting;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o1.getProductQuantity()-o2.getProductQuantity());
	}

}
