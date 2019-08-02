package instruments;

public class Guitar {

    private String type;
    private String colour;
    private String material;
    private String make;
    private double purchasePrice;
    private double salePrice;
    private int noOfStrings;
    private String handed;
    private String description;

    public Guitar(String type, String colour, String material, String make, double purchasePrice,
                  double salePrice, int noOfStrings, String handed ) {
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.make = make;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.noOfStrings = noOfStrings;
        this.handed = handed;
        this.description = "Guitar";
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

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getHanded() {
        return handed;
    }

    public String getDescription() {
        return description;
    }

    public String play() {
        return "I am a " + this.description + " and I go Strum Strum.";
    }

    public double calculateMarkup() {
        return this.salePrice - this.purchasePrice;
    }
}
