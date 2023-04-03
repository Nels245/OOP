package Homework.DZ_1;

public class Limonad extends Drink {

    public Limonad(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Limonad() {
        super("Coca-Cola", 99, 3, "Liters");
        this.Volume = 1.5;
    }

    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

}
