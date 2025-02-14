package DynamicOnlineMarketPlace;

import java.util.ArrayList;
import java.util.List;

public class Product<T extends ProductCatalog>{
    private List<T> product = new ArrayList<>();
    public void addItem(T item) {
        product.add(item);
    }
    public void removeItem(T item) {
        product.remove(item);
    }
    public List<T> getItems() {
        return product;
    }
    public void showDetails() {
        for (T product : product) {
            product.showDetails();
        }
    }
}
