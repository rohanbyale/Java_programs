import java.util.*;

class Main {
    public static void ProductCatelog(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product names one by one");
        String product[] = new String[4];

        for (int i = 0; i <= product.length - 1; i++) {
            product[i] = sc.next();
        }
        ProductCatelog obj = new ProductCatelog(product);
        System.out.println("Enter the index");
        int index = sc.nextInt();
        try {
            obj.displayProduct(product, index);
        } catch (InvalidProductIndexException e) {
            System.out.println(e.getMessage());
        }

    }
}

class InvalidProductIndexException extends Exception {
    public InvalidProductIndexException(String errorMessage) {
        super(errorMessage);
    }
}

class ProductCatelog {
    private String products[];

    public ProductCatelog(String products[]) {
        this.products = products;
    }

    public void displayProduct(String products[], int index) throws InvalidProductIndexException {
        if (index < 1) {
            throw new InvalidProductIndexException("Invalid Product Index");
        } else if (index >= 5) {
            throw new InvalidProductIndexException("Invalid Product index");
        }

        for (int i = 0; i <= products.length - 1; i++) {
            if (index - 1 == i) {
                System.out.println(products[i]);
            }
        }
    }
}