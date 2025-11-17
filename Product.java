public class Product {
    private String name;
    private double price;
    private int quantity;
    private double totalAmount;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalAmount = price * quantity;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
    }

    // Main method to test
    public static void main(String[] args) {
        Product p = new Product("Gaming Mouse", 1500.5, 3);
        p.display();
    }
}
