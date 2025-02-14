package SmartWarehouseManagementSystem;

public class Groceries extends WarehouseItem {
    private String expirationDate;
    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }
    public void showDetails() {
        System.out.println("Groceries : " + name);
        System.out.println("Expiration Date : " + expirationDate);
        System.out.println("Price : " + price);
    }
}
