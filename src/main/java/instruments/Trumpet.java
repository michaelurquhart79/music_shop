package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;
    private TrumpetTuningType tuning;

    public Trumpet(InstrumentTypes type, String colour, String material, String make,
                   double purchasePrice, double salePrice, int numberOfValves, TrumpetTuningType tuning) {
        super(type, colour, material, make, purchasePrice, salePrice);
        this.numberOfValves = numberOfValves;
        this.description = "Trumpet";
        this.tuning = tuning;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public TrumpetTuningType getTuning() {
        return tuning;
    }

    public String play() {
        return "I am a " + this.description + " and I go toot toot.";
    }
}
