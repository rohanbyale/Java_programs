package ArrayList;

import java.util.*;

public class ProductSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Product");
		int n = sc.nextInt();
		ArrayList<Product> p = new ArrayList();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Product id, name,price,quantity");
			int productId = sc.nextInt();
			sc.nextLine();
			String productName = sc.next();
			double price = sc.nextDouble();
			int quantity = sc.nextInt();

			p.add(new Product(productId, productName, price, quantity));
		}

		System.out.println("Enter product id for search product");
		int target = sc.nextInt();
		Collections.sort(p);

		for (Product e : p) {
			System.out.println(e);
		}

		for (Product e : p) {
			if (e.productId == target) {
				System.out.println(e);
				break;
			}
		}

	}
}

class Product implements Comparable<Product> {
	public int productId;
	public String productName;
	public double price;
	public int quantity;

	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.productId - o.productId;
	}

}
