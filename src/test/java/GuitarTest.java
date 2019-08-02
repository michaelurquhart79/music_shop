import instruments.Guitar;
import instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentTypes.STRING, "red", "wood",
                "Fender", 250.00, 450.00, 6, "right");
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentTypes.STRING, guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(250.00, guitar.getPurchasePrice(), 0.001);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(450.00, guitar.getSalePrice(), 0.001);
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void hasHanded() {
        assertEquals("right", guitar.getHanded());
    }

    @Test
    public void hasDescription() {
        assertEquals("Guitar", guitar.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("I am a Guitar and I go Strum Strum.", guitar.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(200.00, guitar.calculateMarkup(), 0.001);
    }

}
