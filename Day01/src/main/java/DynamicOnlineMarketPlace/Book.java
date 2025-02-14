package DynamicOnlineMarketPlace;

public class Book extends ProductCatalog {
    String author;
   Book( String name,double price,String author) {
       super(name ,price);
       this.author = author;
   }
   public void showDetails() {
      System.out.println("Book Name: " + getName() + " , "+ " Author : " + author + " , " + "  Price: " + getPrice());
   }
}
