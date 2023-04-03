package Homework.DZ_1;

public class Masks extends Hygiene_items {

    public Masks(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Masks() {
        super("Masks", 10, 7, "Packages");
        this.PiecesPerPack = 5;
    }

    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

}
