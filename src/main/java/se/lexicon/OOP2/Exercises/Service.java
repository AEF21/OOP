package se.lexicon.OOP2.Exercises;

 public abstract class Service {

    private int id;              // Unique identifier
    private String name;         // Service name
    private int basePrice;       // Base price in SEK

    // Constructor
    public Service(int id, String name, int basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    // Abstract method required by the exercise
    public abstract int calculatePrice();

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
