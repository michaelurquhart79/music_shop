package instruments;

public class Guitar extends Instrument{


    private int noOfStrings;
    private HandedType handed;

    public Guitar(InstrumentTypes type, String colour, String material, String make, double purchasePrice, double salePrice,
                  int noOfStrings, HandedType handed) {
        super(type, colour, material, make, purchasePrice, salePrice);
        this.noOfStrings = noOfStrings;
        this.handed = handed;
        this.description = "Guitar";
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public HandedType getHanded() {
        return handed;
    }

    public String getDescription() {
        return description;
    }

    public String play() {
        return "I am a " + this.description + " and I go Strum Strum.";
    }

}
