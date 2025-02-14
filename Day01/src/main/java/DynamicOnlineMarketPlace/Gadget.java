package DynamicOnlineMarketPlace;

public class Gadget extends ProductCatalog {
    String gadgetbrand;
    Gadget(String name,double price,String gadgetbrand) {
        super(name,price);
        this.gadgetbrand = gadgetbrand;
    }
    public void showDetails() {
       System.out.println("Gadget Name: " + getName() + " , " + " GadgetBrand : " + gadgetbrand + " , " + " Price: " + getPrice());
    }
}
