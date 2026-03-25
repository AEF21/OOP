package se.lexicon.OOP2.Exercises;

import java.util.List;

public class BookingProcessorImpl implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {
        return null;
    }


    @Override
    public void process(List<Service> serviceList) {
        for (Service service : serviceList) {
            System.out.println(service.getName()+ "total Price" + service.calculatePrice());
        }
    }
}
