package se.lexicon.OOP2.Exercises;

public class BookingRequest {
    private Service service;

    public  BookingRequest(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }

}
