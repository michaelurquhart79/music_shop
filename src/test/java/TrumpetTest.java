import instruments.InstrumentTypes;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(InstrumentTypes.BRASS, "gold", "Brass", "Bach Stradivarius",
                1000.00, 1400.00, 3);
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void hasDescription(){
        assertEquals("Trumpet", trumpet.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("I am a Trumpet and I go toot toot.", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400.00, trumpet.calculateMarkup(), 0.001);
    }

}
