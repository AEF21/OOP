package se.lexicon.OOP2.Exercises;

import java.util.ArrayList;
import java.util.List;

public class TireChangeApp {

    public static void main(String[] args) {
        List<Service> services = new ArrayList<>();


        services.add(new SummerTireChange(1, "Summer Change", 300, true, 100));
        services.add(new WinterTireChange(2, "Winter Change", 300, true, 100));

        BookingProcessor processor = new BookingProcessorImpl();
        processor.process(services);



    }
}
