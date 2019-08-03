import accessories.Accessory;
import behaviours.ISell;
import instruments.*;
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
        trumpet1 = new Trumpet(InstrumentTypes.BRASS, "gold", "Brass", "Bach Stradivarius",
                1000.00, 1400.00, 3);
        piano1 = new Piano(InstrumentTypes.KEYBOARD, "black", "wood", "Yamaha", 1500.00,
                2500.00, 94, false);
        guitar1 = new Guitar(InstrumentTypes.STRING, "red", "wood",
                "Fender", 250.00, 450.00, 6, HandedType.RIGHT);
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

    @Test
    public void canRemoveStock() {
        shop.addToStock(trumpet1);
        shop.addToStock(piano1);
        shop.addToStock(guitar1);
        assertEquals(3, shop.stockCount());
        assertEquals(true, shop.getStock().contains(piano1));
        shop.removeFromStock(piano1);
        assertEquals(2, shop.stockCount());
        assertEquals(false, shop.getStock().contains(piano1));
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addToStock(trumpet1);
        shop.addToStock(piano1);
        shop.addToStock(guitar1);
        assertEquals(1600, shop.totalPotentialProfit());
    }

}
