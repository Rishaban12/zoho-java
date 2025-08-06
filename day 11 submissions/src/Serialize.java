import java.io.*;

class Product implements Serializable {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId,String name,double price,int quantity){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
public class Serialize {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
          Product product=new Product(112,"laptop",50000.00,2);
        FileOutputStream fos=new FileOutputStream("Electronics.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(product);
        oos.close();
        fos.close();
        System.out.println("serialization done");


    }
}
