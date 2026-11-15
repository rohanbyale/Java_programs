package ArrayList;

import java.util.*;

public class OnlineShoppingProductSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Product");
		int n = sc.nextInt();
		ArrayList<ProductContain> pc = new ArrayList<ProductContain>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Product ID, Product Name, Product Price, Product Quantity");
			int productid = sc.nextInt();
			sc.nextLine();
			String productName = sc.nextLine();
			double productPrice = sc.nextDouble();
			int quantity = sc.nextInt();

			pc.add(new ProductContain(productid, productName, productPrice, quantity));

		}

		for (ProductContain e : pc) {
			e.displayProduct();
		}
		System.out.println("-------------------------------------------");
		Collections.sort(pc);

		for (ProductContain e : pc) {
			e.displayProduct();
		}

		System.out.println("--------------------------------------------");

		Collections.sort(pc, new StocValueComparator());

		for (ProductContain e : pc) {
			e.displayProduct();
		}
		System.out.println("--------------------------------------");
		System.out.println("Enter Prodcut ID for Search for Product ");
		int id = sc.nextInt();

		for (ProductContain e : pc) {
			if (id == e.productid) {
				e.displayProduct();
				break;
			} else {
				System.out.println("Product Not Found");
			}
		}
		System.out.println("-------------------");
//		double max = 0;
//		for (ProductContain e : pc) {
//			if (e.calculateStockValue() > max) {
//				max = e.calculateStockValue();
//			}
//		}
//
//		for (ProductContain e : pc) {
//			if (e.calculateStockValue() == max) {
//				System.out.println("Highest Product Value :" + e.productName);
//			}
//		}

		ProductContain max = pc.get(0);

		for (ProductContain e : pc) {
			if (e.calculateStockValue() > max.calculateStockValue()) {
				max = e;
			}
		}

		System.out.println("Highest Product Value : " + max.productName);

	}

}

class ProductContain implements Comparable<ProductContain> {
	int productid;
	String productName;
	double productPrice;
	int quantity;

	public ProductContain(int productid, String productName, double productPrice, int quantity) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}

	double calculateStockValue() {
		return productPrice * quantity;
	}

	void displayProduct() {
		System.out.println("Product ID : " + productid);
		System.out.println("Product Name : " + productName);
		System.out.println("Product Name : " + productName);
		System.out.println("Product Quantity : " + quantity);
		System.out.println("Calculate Salary : " + calculateStockValue());

	}

	@Override
	public int compareTo(ProductContain o) {
		if (this.productPrice != o.productPrice) {
			return (int) (this.productPrice - o.productPrice);
		} else {
			return this.productid - o.productid;
		}

	}

}

class StocValueComparator implements Comparator<ProductContain> {

	@Override
	public int compare(ProductContain o1, ProductContain o2) {
		if (o2.calculateStockValue() != o1.calculateStockValue()) {
			return (int) (o2.calculateStockValue() - o1.calculateStockValue());
		} else {
			return o2.productid - o1.productid;
		}
	}

}