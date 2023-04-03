package Homework.DZ_1;

import java.util.Random;

public class BaseInfo {
    protected String name;
    protected double price;
    protected double count;
    protected String measure;

    public BaseInfo(String name, double price, double count, String measure) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.measure = measure;
    }

    public String getInfo() {
        return String.format("Name: %s Price: %.2f. Count: %.2f. Measure: %s",
                this.name, this.price, this.count, this.measure);
    }
}
