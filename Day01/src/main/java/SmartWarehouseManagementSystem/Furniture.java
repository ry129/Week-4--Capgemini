package SmartWarehouseManagementSystem;

public class Furniture extends WarehouseItem {
    private String material;
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }
    public void showDetails() {
        System.out.println("Furniture : " + name);
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
    }
}
