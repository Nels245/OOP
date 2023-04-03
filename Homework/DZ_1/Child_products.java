package Homework.DZ_1;

public class Child_products extends BaseInfo {

    public int MinAge;
    public String Allergic;

    public Child_products(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Child_products() {
        super("Lego", 150, 5, "Quantity");
        this.MinAge = 3;
        this.Allergic = "Allergic";
    }

    public String getInfo() {
        return String.format("%s. MinAge: %d. Allergic: %s.", super.getInfo(), this.MinAge, this.Allergic);
    }

}
