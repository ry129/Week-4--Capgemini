package DynamicOnlineMarketPlace;
import java.util.ArrayList;
import java.util.List;

abstract class ProductCatalog {
    private String name;
    private double price;



    ProductCatalog( String name,double price){
    this.name = name;
        this.price = price;

    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void showDetails();
}



