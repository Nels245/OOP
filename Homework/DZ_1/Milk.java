package Homework.DZ_1;

public class Milk extends Drink {

    private double PercentOfFat;
    private String ExpirationDate;

    public Milk(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Milk() {
        super("Milk", 20, 3, "Liters");
        this.Volume = 1.5;
        this.PercentOfFat = 3;
        this.ExpirationDate = "16.02.2023";
    }

    public String getInfo() {
        return String.format("%s PercentOfFat: %.2f. ExpirationDate: %s.", super.getInfo(), this.PercentOfFat,
                this.ExpirationDate);
    }

}
