import java.util.ArrayList;
import java.util.List;
public class Product {
    int productId;
    String name;
    double price;
    int quantity;

   public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("ProductId: " + productId);
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
    }
}
 class Store {
     static String storeName;
     static String location;
     List<Product> products = new ArrayList<>();

     public void addProduct(Product product) {
         products.add(product);
     }

     public void displayAllProducts() {
         for (Product p : products) {
             p.displayProduct();
         }
     }

     public static void setStoreDetails(String name, String location) {
         Store.storeName = name;
         Store.location = location;
     }

     public static void displayStoreDetails() {
         System.out.println("StoreName: " + storeName);
         System.out.println("Location: " + location);
     }
 }

class Inventory{
        public static void main(String[] args){
         Store.setStoreDetails("malligai", "tenkasi");
         Product p1=new Product(1, "laptop",45000,5);
            Product p2=new Product(2, "cycle",4500,5);
            Product p3=new Product(3, "tv",10000,7);
          Store myStore= new Store();
          myStore.addProduct(p1);
          myStore.addProduct(p2);
          myStore.addProduct(p3);

          Store.displayStoreDetails();
          myStore.displayAllProducts();

        }
    }

