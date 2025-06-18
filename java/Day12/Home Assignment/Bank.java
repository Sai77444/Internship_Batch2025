class Product {
    // Private fields
    private int productId;
    private String name;
    private double price;

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: ₹" + price);
    }
}

// Main class to test
public class Bank {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setProductId(101);
        p1.setName("Laptop");
        p1.setPrice(55000.00);

        // Display product details
        p1.displayDetails();
    }
}
