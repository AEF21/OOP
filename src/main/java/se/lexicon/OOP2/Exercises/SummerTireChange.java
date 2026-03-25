package se.lexicon.OOP2.Exercises;
//SubClass
public final class SummerTireChange extends Service {

    private boolean needNewTire;
    private double summerTireCost;


    public SummerTireChange(int id, String name, int basePrice, boolean needsNewTire, double summerTireCost) {
        super(id, name, basePrice);
        this.needNewTire = needsNewTire;
        this.summerTireCost = summerTireCost;
    }

    @Override
    public int calculatePrice() {
        double total = getBasePrice();

        total += summerTireCost;

        if (needNewTire) {
            total += 300;
            total -= 100;
        }
        return (int) total;
    }
}
