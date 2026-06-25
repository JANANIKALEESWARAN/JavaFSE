public class InventoryTest {

    public static void main(String[] args) {

        InventoryManagement inventory = new InventoryManagement();

        inventory.addProduct(new Product(101, "Laptop", 20, 50000));
        inventory.addProduct(new Product(102, "Mouse", 50, 500));

        System.out.println("\nInventory:");
        inventory.displayProducts();

        inventory.updateProduct(101, 25, 52000);

        inventory.deleteProduct(102);

        System.out.println("\nUpdated Inventory:");
        inventory.displayProducts();
    }
}