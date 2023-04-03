package Homework.DZ_1;

public class Diapers extends Child_products {

    private String Size;
    private double MinWeight;
    private double MaxWeight;
    private String Type;

    public Diapers(String name, double price, double count, String measure) {
        super(name, price, count, measure);
    }

    public Diapers() {
        super("Diapers", 2, 16, "Packages");
        this.Size = "Medium";
        this.MinWeight = 1;
        this.MaxWeight = 2;
        this.Type = "Nice";
        this.MinAge = 0;
        this.Allergic = "Not allergic";
    }

    public String getInfo() {
        return String.format("%s Size: %s. MinWeight: %.3f. MaxWeight: %.3f. Type: %s.", super.getInfo(), this.Size,
                this.MinWeight, this.MaxWeight, this.Type);
    }

}
