package SmartWarehouseManagementSystem;
import java.util.ArrayList;
import java.util.List;

public abstract class WarehouseItem {
    public String name;
    public double price;

    WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void showDetails();

}


