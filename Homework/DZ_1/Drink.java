package Homework.DZ_1;

public class Drink extends BaseInfo {

    public double Volume;

    public Drink(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Drink() {
        super("Juice", 50, 5, "Liters");
        this.Volume = 2;
    }

    public String getInfo() {
        return String.format("%s. Volume: %.2f.", super.getInfo(), this.Volume);
    }

}
