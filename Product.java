class Product{
    private String product_name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category){
        this.product_name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public String getName(){
        return product_name;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public void setQuantity(int n){
        quantity = n;
    }
    public void setPrice(double new_price){
        price = new_price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String display(){
        return "Product Name: "+product_name+", Price: "+price+", Quantity: "+quantity+", Category: "+category;
    }
}