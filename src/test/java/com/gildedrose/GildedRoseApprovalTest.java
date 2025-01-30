package com.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gildedrose.itembuilder.Item;

class GildedRoseApprovalTest {

    private GildedRose gildedRose;
    private Item[] item;


    @BeforeEach
    void setUp() {
     item = new Item[]{new Item("", 0, 0)};
    }
    @Test
    void testRegularItemBeforeSellIn() {
    	
    	item = new Item[] { new Item("Regular Item", 10, 20)};
        gildedRose =  new GildedRose(item);
        gildedRose.updateQuality(item);;

        assertEquals(4, item[0].sellIn);
        assertEquals(9, item[1].quality);
    }

    @Test
    void testRegularItemAfterSellIn() {
    	item = new Item[] {new Item("Regular Item", 0, 10)};
        gildedRose =  new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(-1, item[0].sellIn);
        assertEquals(8, item[0].quality);
    }

    @Test
    void testAgedBrieBeforeSellIn() {

        item = new Item[]{new Item("Aged Brie", 5, 10)};
        gildedRose =  new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(4, item[0].sellIn);
        assertEquals(11, item[0].quality);
    }

    @Test
    void testAgedBrieAfterSellIn() {
    	item = new Item[] {new Item("Aged Brie", 0, 10)};
        gildedRose = new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(-1, item[0].sellIn);
        assertEquals(12, item[0].quality);
    }

    @Test
    void testBackstagePassesBeforeSellIn() {
    	item = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
        gildedRose = new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(14, item[0].sellIn);
        assertEquals(21, item[0].quality);
    }

    @Test
    void testBackstagePassesTenDaysOrLess() {
    	item = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20)};
        gildedRose = new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(8, item[0].sellIn);
        assertEquals(22, item[0].quality);
    }

    @Test
    void testBackstagePassesFiveDaysOrLess() {
    	item = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 4, 20)};
        gildedRose = new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(3, item[0].sellIn);
        assertEquals(23, item[0].quality);
    }

    @Test
    void testBackstagePassesAfterSellIn() {
    	item = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20)};
        gildedRose = new GildedRose(item);
        gildedRose.updateQuality(item);

        assertEquals(-1, item[0].sellIn);
        assertEquals(0, item[0].quality);
    }

    @Test
    void testSulfurasDoesNotChange() {
    	item = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
        gildedRose = new GildedRose(item);
        gildedRose.updateQuality (item);

        assertEquals(5, item[0].sellIn);
        assertEquals(80, item[0].quality);
    }
}
