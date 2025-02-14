package SmartWarehouseManagementSystem;

public class Electronics extends WarehouseItem {
    private String brand;
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;

    }
    public void showDetails() {
        System.out.println("Electronics : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}
