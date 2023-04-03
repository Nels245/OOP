package Homework.DZ_1;

public class Pacifier extends Child_products {

    public Pacifier(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Pacifier() {
        super("Pacifier", 2, 16, "Packages");
        this.MinAge = 0;
        this.Allergic = "Not allergic";
    }

    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

}
