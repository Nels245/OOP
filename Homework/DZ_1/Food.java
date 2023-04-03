package Homework.DZ_1;

public class Food extends BaseInfo {

    public String ExpirationDate;

    public Food(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Food() {
        super("Apple", 15, 3, "Kilo");
        this.ExpirationDate = "14.02.2023";
    }

    public String getInfo() {
        return String.format("%s. ExpirationDate: %s.", super.getInfo(), this.ExpirationDate);
    }

}
