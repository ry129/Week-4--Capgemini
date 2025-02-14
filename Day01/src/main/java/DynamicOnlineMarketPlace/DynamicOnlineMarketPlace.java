package DynamicOnlineMarketPlace;

public class DynamicOnlineMarketPlace {
    public static void main(String[] args) {
        Product<Book> booksProduct = new Product<Book>();
        Product<Clothing> clothingProduct = new Product<Clothing>();
        Product<Gadget> gadgetProduct = new Product<Gadget>();

        booksProduct.addItem(new Book("Tempest", 200,"William"));
        booksProduct.addItem(new Book("Drama",300,"Book Two"));

        clothingProduct.addItem(new Clothing("jeans",4000,"H&M"));
      clothingProduct.addItem(new Clothing("Shirt",5000,"Zudio"));

      gadgetProduct.addItem(new Gadget("RacingCar",300,"Toy"));
      gadgetProduct.addItem(new Gadget("ElectricCar",450,"Toy2"));

      System.out.println("**Books in Storage**");
      booksProduct.showDetails();

      System.out.println("**Clothes in Storage**");
      clothingProduct.showDetails();

      System.out.println("**Gadgets in Storage**");
      gadgetProduct.showDetails();



        System.out.println("Applying Discounts...");
        DiscountUtil.applyDiscount(booksProduct.getItems().get(0), 10);
        DiscountUtil.applyDiscount(booksProduct.getItems().get(1), 20);
        DiscountUtil.applyDiscount(clothingProduct.getItems().get(1), 15);
        DiscountUtil.applyDiscount(clothingProduct.getItems().get(0), 30);
        DiscountUtil.applyDiscount(gadgetProduct.getItems().get(0), 20);
        DiscountUtil.applyDiscount(gadgetProduct.getItems().get(1), 40);



    }
}
