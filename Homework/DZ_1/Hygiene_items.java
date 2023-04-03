package Homework.DZ_1;

public class Hygiene_items extends BaseInfo {

    public int PiecesPerPack;

    public Hygiene_items(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Hygiene_items() {
        super("Soap", 10, 2, "Packages");
        this.PiecesPerPack = 4;
    }

    public String getInfo() {
        return String.format("%s. PiecesPerPack: %d.", super.getInfo(), this.PiecesPerPack);
    }

}
