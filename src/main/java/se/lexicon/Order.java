package se.lexicon;

import java.util.ArrayList;
import java.util.List;

// Create a class Order
public class Order {

    // An order contains multiple products (use a collection)
    private List<Product> products = new ArrayList<>();

    // Each order should have its own ID (recommended)
    private String orderId;

    // Constructor
    public Order(String orderId) {
        this.orderId = orderId;
    }

    // Getter to access order data
    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Add methods
    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    // Calculate total price
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
