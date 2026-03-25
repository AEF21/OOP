package se.lexicon.OOP2.Exercises;
//subClass
public  final class  WinterTireChange extends Service {

    private boolean needNewTire;
    private double winterTireCost;


    public WinterTireChange(int id, String name,int basePrice, boolean needNewTire, double winterTireCost) {
        super(id, name, basePrice);
        this.needNewTire = needNewTire;
        this.winterTireCost = winterTireCost;
    }

    @Override
    public int calculatePrice() {
        double total = getBasePrice();

        total += winterTireCost;

        if (needNewTire) {
            total += 300;
            total -= 100;
        }
        return (int) total;
    }
}

