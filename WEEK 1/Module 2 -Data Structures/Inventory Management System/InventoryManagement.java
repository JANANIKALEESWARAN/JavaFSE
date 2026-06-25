import java.util.HashMap;

class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();


    void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added");
    }


    void updateProduct(int id, int quantity, double price) {
        Product p = inventory.get(id);

        if (p != null) {
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product Updated");
        } else {
            System.out.println("Product Not Found");
        }
    }


    void deleteProduct(int id) {
        if (inventory.remove(id) != null)
            System.out.println("Product Deleted");
        else
            System.out.println("Product Not Found");
    }


    void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}