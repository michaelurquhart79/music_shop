package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;
    private boolean electric;

    public Piano(InstrumentTypes type, String colour, String material, String make, double purchasePrice, double salePrice, int numberOfKeys, boolean electric) {
        super(type, colour, material, make, purchasePrice, salePrice, "Piano");
        this.numberOfKeys = numberOfKeys;
        this.electric = electric;
    }

    public String play(){
        return "I am a " + this.getDescription() + " and I go plink plonk.";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public boolean isElectric() {
        return electric;
    }
}
