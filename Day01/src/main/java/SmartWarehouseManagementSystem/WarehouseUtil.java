package SmartWarehouseManagementSystem;

import java.util.List;

public class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.showDetails();
        }
    }
}
