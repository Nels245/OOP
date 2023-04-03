package Homework.DZ_1;

public class Eggs extends Food {

    private int PiecesPerPack;

    public Eggs(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Eggs() {
        super("Eggs", 18, 25, "Quantity");
        this.ExpirationDate = "28.02.2023";
        this.PiecesPerPack = 10;
    }

    public String getInfo() {
        return String.format("%s PiecesPerPack: %s.", super.getInfo(), this.PiecesPerPack);
    }

}
