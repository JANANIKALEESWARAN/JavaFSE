import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    
    public static Product linearSearch(Product[] products, int id) {

        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }


    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];

            if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(105, "Mouse", "Electronics"),
            new Product(110, "Keyboard", "Electronics"),
            new Product(115, "Monitor", "Electronics"),
            new Product(120, "Printer", "Electronics")
        };

        Product result1 = linearSearch(products, 110);

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        Product result2 = binarySearch(products, 115);

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}