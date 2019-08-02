package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;
    private boolean electric;

    public Piano(String type, String colour, String material, String make, double purchasePrice, double salePrice, int numberOfKeys, boolean electric) {
        super(type, colour, material, make, purchasePrice, salePrice);
        this.numberOfKeys = numberOfKeys;
        this.electric = electric;
        this.description = "Piano";
    }

    public String play(){
        return "I am a " + this.description + " and I go plink plonk.";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public boolean isElectric() {
        return electric;
    }
}
