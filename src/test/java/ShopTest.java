import accessories.Accessory;
import behaviours.ISell;
import instruments.Guitar;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    ISell trumpet1;
    ISell piano1;
    ISell guitar1;
    ISell guitarStrings;
    ISell sheetMusic;
    Shop shop;

    @Before
    public void setup(){
        trumpet1 = new Trumpet("Brass", "gold", "Brass", "Bach Stradivarius",
                1000.00, 1400.00, 3);
        piano1 = new Piano("Keyboard", "black", "wood", "Yamaha", 1500.00,
                2500.00, 94, false);
        guitar1 = new Guitar("String", "red", "wood",
                "Fender", 250.00, 450.00, 6, "right");
        guitarStrings = new Accessory("Guitar Strings", 2.59, 5.99);
        sheetMusic = new Accessory("The Vines Highly Evolved Tab Book", 5.50, 10.50);
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void initiallyHasNoStock() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addToStock(trumpet1);
        assertEquals(1, shop.stockCount());
    }

}
