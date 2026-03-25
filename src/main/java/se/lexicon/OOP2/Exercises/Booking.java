package se.lexicon.OOP2.Exercises;

public class Booking {
 private int id ;
 private String Service ;
 private  int totalPrice;

    public Booking(int id, String service, int totalPrice) {
        this.id = id;
        Service = service;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", Service='" + Service + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
