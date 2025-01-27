import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Supplier> suppliers = new ArrayList<>();

    public void addSupplier(Supplier supplier){
        if(suppliers.contains(supplier)){
            System.out.println("Supplier already Found");
            return;
        }
        suppliers.add(supplier);
        System.out.println("Supplier Added");
    }
    public void addProduct(Product product){
        if(products.contains(product)){
            System.out.println("Product Already Found");
            return;
        }
        products.add(product);
        System.out.println("Product Added");
    }
    public void addQuantity(String name, int new_quantity){
        for(Product product : products){
            if(product.getName().equals(name)){
                product.setQuantity(product.getQuantity() + new_quantity);
                System.out.println("Quantity Added");
                return;
            }
        }
        System.out.println("Product Not Found");
    }
    public void changePrice(String name, double new_price){
        for(Product product : products){
            if(product.getName().equals(name)){
                product.setPrice(new_price);
                System.out.println("Price Changed");
                return;
            }
        }
        System.out.println("Product Not Found");
    }
    public void removeSupplier(String name){
        for (Supplier supplier : suppliers){
            if(supplier.getName().equals(name)){
                suppliers.remove(supplier);
                System.out.println("Supplier Removed");
                return;
            }
        }
        System.out.println("Supplier Not Found");
    }
    public void removeProduct(String name){
        for (Product product : products){
            if(product.getName().equals(name)){
                products.remove(product);
                System.out.println("Product Removed");
                return;
            }
        }
        System.out.println("Product Not Found");
    }
    public void viewProducts(){
        for (Product product : products){
            System.out.println(product.display());
        }
    }
    public void viewSuppliers(){
        for (Supplier supplier : suppliers){
            System.out.println(supplier.display());
        }
    }
    public static void main(String[] args){
        // Create an array of products
        Inventory inv = new Inventory();
        Scanner r = new Scanner(System.in);
        // inv.addProduct(new Product("Apple", 10, 50, "Fruits"));
        // inv.addProduct(new Product("Mango", 10, 45, "Fruits"));
        // inv.addProduct(new Product("Brinjal", 15, 101, "Vegetables"));
        // inv.addProduct(new Product("Potato", 20, 25, "Vegetables"));
        // inv.viewProducts();
        // inv.addSupplier(new Supplier("Harish", "Harishvishwa003@gmail.com", "396, Kulathur, Ariyalur"));
        // inv.addSupplier(new Supplier("Ragini", "ragininsankar2003@gmail.com", "398, Kulathur, Ariyalur"));
        // inv.addSupplier(new Supplier("Eshwar", "evergreeneshwar@gmail.com", "18, Sirkali, Kumbakonam"));
        // inv.addSupplier(new Supplier("Bagath", "bagathssp@gmail.com", "12, Tirupur"));
        // inv.viewSuppliers();
        int choice;
         do { 
            System.out.println("\n Inventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Change Quantity");
            System.out.println("4. Change Price");
            System.out.println("5. View Products");
            System.out.println("6. Add Supplier");
            System.out.println("7. Remove Supplier");
            System.out.println("8. View Suppliers");
            System.out.println("9. Exit");
            System.out.println("\nEnter Your Choice: ");
            choice = r.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter Product name: ");
                    String name = r.next();
                    System.out.println("Enter Product quantity: ");
                    int quantity = r.nextInt();
                    System.out.println("Enter Product price: ");
                    double price = r.nextDouble();
                    System.out.println("Enter Product category: ");
                    String category = r.next();
                    inv.addProduct(new Product(name, price, quantity, category));
                    break;
                case 2:
                    System.out.println("Enter Product Name to Remove: ");
                    String p_name = r.next();
                    inv.removeProduct(p_name);
                    break;
                case 3:
                    System.out.println("Enter Product Name to Change Quantity: ");
                    String p_name1 = r.next();
                    System.out.println("Enter Quantity to Add: ");
                    int no = r.nextInt();
                    inv.addQuantity(p_name1, no);
                    break;
                case 4:
                    System.out.println("Enter Product Name to Change price: ");
                    String p_name2 = r.next();
                    System.out.println("Enter New Price: ");
                    double new_price = r.nextDouble();
                    inv.changePrice(p_name2, new_price);
                    break;
                case 5:
                    inv.viewProducts();
                    break;
                case 6:
                    System.out.println("Enter Supplier Name: ");
                    String s_name = r.next();
                    System.out.println("Enter Supplier Email: ");
                    String s_email = r.next();
                    System.out.println("Enter Supplier Address: ");
                    String s_address = r.nextLine();
                    inv.addSupplier(new Supplier(s_name, s_email, s_address));
                    break;
                case 7:
                    System.out.println("Enter Supplier Name to Remove: ");
                    String s_name1 = r.next();
                    inv.removeSupplier(s_name1);
                    break;
                case 8: 
                    inv.viewSuppliers();
                    break;
                case 9:
                    System.out.println("Exiting.....");
                    break;
            }
         } while (choice != 9);

    }
}