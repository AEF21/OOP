package se.lexicon;
// Create a `Product` class.
public class Product {

    //Add the required fields (e.g., productId, name, price).

    private String productId;
    private String name;
    private int price;

    //Apply **encapsulation** by making all fields private.
    //- Use:
    //**Constructors** to initialize product data
    public Product(String productId, String name, int price ){
        this.productId = productId;
        this.name = name;
        this.price = price;

    }

    //Setters to update product details safely

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Getters to read product information

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    //Demonstrate that each object maintains its own state.
    //Create a UML class diagram for the `Product` class.
}
