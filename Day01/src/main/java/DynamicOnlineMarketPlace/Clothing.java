package DynamicOnlineMarketPlace;

public class Clothing extends ProductCatalog {
    String brand;
    Clothing(String name,double price,String brand) {
        super(name,price);
        this.brand = brand;
    }
    public void showDetails() {
        System.out.println("Clothing Name: " + getName() + " , " + " Brand :" + brand + " , " + " Price: " + getPrice());
    }
}
