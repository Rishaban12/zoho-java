import java.io.*;
import java.util.*;

class Product implements Serializable {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

public class ProductManager {
    static final String FILE_NAME = "products.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:\n1. Add Product\n2. View All\n3. Search by ID\n4. Update\n5. Delete\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    searchProductById(sc);
                    break;
                case 4:
                    updateProduct(sc);
                    break;
                case 5:
                    deleteProduct(sc);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }

    static void addProduct(Scanner sc) {
        try {
            List<Product> products = loadProducts();

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            products.add(new Product(id, name, price, quantity));
            saveProducts(products);
            System.out.println("Product added successfully.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void viewAllProducts() {
        try {
            List<Product> products = loadProducts();
            if (products.isEmpty()) {
                System.out.println("No products found.");
            } else {
                for (Product p : products) {
                    System.out.println(p);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void searchProductById(Scanner sc) {
        try {
            List<Product> products = loadProducts();
            System.out.print("Enter Product ID to search: ");
            int id = sc.nextInt();
            boolean found = false;

            for (Product p : products) {
                if (p.productId == id) {
                    System.out.println("Found: " + p);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Product not found.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void updateProduct(Scanner sc) {
        try {
            List<Product> products = loadProducts();
            System.out.print("Enter Product ID to update: ");
            int id = sc.nextInt();
            boolean updated = false;

            for (Product p : products) {
                if (p.productId == id) {
                    System.out.print("Enter new Price: ");
                    p.price = sc.nextDouble();
                    System.out.print("Enter new Quantity: ");
                    p.quantity = sc.nextInt();
                    updated = true;
                    break;
                }
            }
            if (updated) {
                saveProducts(products);
                System.out.println("Product updated.");
            } else {
                System.out.println("Product not found.");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void deleteProduct(Scanner sc) {
        try {
            List<Product> products = loadProducts();
            System.out.print("Enter Product ID to delete: ");
            int id = sc.nextInt();
            boolean deleted = products.removeIf(p -> p.productId == id);

            if (deleted) {
                saveProducts(products);
                System.out.println("Product deleted.");
            } else {
                System.out.println("Product not found.");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static List<Product> loadProducts() throws IOException, ClassNotFoundException {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) ois.readObject();
        }
    }

    static void saveProducts(List<Product> products) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
        }
    }
}
