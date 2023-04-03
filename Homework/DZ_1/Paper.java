package Homework.DZ_1;

public class Paper extends Hygiene_items {

    private int layers;

    public Paper(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Paper() {
        super("Paper", 2, 16, "Packages");
        this.PiecesPerPack = 4;
        this.layers = 2;
    }

    public String getInfo() {
        return String.format("%s Layers: %d.", super.getInfo(), this.layers);
    }

}
