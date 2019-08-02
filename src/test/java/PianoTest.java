import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Keyboard", "black", "wood", "Yamaha", 1500.00,
                2500.00, 94, false);
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(94, piano.getNumberOfKeys());
    }

    @Test
    public void isElectric() {
        assertEquals(false, piano.isElectric());
    }

    @Test
    public void hasDescription() {
        assertEquals("Piano", piano.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("I am a Piano and I go plink plonk.", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1000.00, piano.calculateMarkup(), 0.001);
    }
}
