package Homework.DZ_1;

public class Bread extends Food {

    private String FlourType;

    public Bread(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Bread() {
        super("Baguette", 18, 3, "Quantity");
        this.ExpirationDate = "25.02.2023";
        this.FlourType = "White";
    }

    public String getInfo() {
        return String.format("%s FlourType: %s.", super.getInfo(), this.FlourType);
    }

}
