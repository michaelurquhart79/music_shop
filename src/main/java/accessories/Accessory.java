package accessories;

import behaviours.ISell;

public class Accessory implements ISell {

    private String description;
    private double purchasePrice;
    private double salePrice;

    public Accessory(String description, double purchasePrice, double salePrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup(){
        return this.salePrice - this.purchasePrice;
    }

}
