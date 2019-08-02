import accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory guitarStrings;

    @Before
    public void before() {
        guitarStrings = new Accessory("Guitar Strings", 2.59, 5.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Guitar Strings", guitarStrings.getDescription());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(2.59, guitarStrings.getPurchasePrice(), 0.001);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(5.99, guitarStrings.getSalePrice(), 0.001);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.40, guitarStrings.calculateMarkup(), 0.001);
    }
}
