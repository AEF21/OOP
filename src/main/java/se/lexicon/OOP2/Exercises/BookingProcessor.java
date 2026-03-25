package se.lexicon.OOP2.Exercises;




import java.util.List;

public interface BookingProcessor {

    Booking processBooking(BookingRequest request);

    void process(List<Service> serviceList);
}





