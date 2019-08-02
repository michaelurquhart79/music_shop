package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String type;
    private String colour;
    private String material;
    private String make;
    private double purchasePrice;
    private double salePrice;
    private String description;

    public Instrument(String type, String colour, String material, String make, double purchasePrice, double salePrice) {
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.make = make;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getMake() {
        return make;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double calculateMarkup() {
        return this.salePrice - this.purchasePrice;
    }

    public abstract String play();
}
