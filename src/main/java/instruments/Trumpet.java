package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(InstrumentTypes type, String colour, String material, String make, double purchasePrice, double salePrice, int numberOfValves) {
        super(type, colour, material, make, purchasePrice, salePrice);
        this.numberOfValves = numberOfValves;
        this.description = "Trumpet";
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "I am a " + this.description + " and I go toot toot.";
    }
}
