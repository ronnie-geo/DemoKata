package com.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gildedrose.itembuilder.Item;

class GildedRoseApprovalTestV2 {

    private GildedRose gildedRose;
    private Item item;


    @BeforeEach
    void setUp() {
       item = new Item("", 0, 0);
    }
    @Test
    void testRegularItemBeforeSellIn() {
    	
    	item = new Item("Regular Item", 5, 10);
        gildedRose =  new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(4, item.sellIn);
        assertEquals(9, item.quality);
    }

    @Test
    void testRegularItemAfterSellIn() {
    	item = new Item("Regular Item", 0, 10);
        gildedRose =  new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(-1, item.sellIn);
        assertEquals(8, item.quality);
    }

    @Test
    void testAgedBrieBeforeSellIn() {

        item = new Item("Aged Brie", 5, 10);
        gildedRose =  new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(4, item.sellIn);
        assertEquals(11, item.quality);
    }

    @Test
    void testAgedBrieAfterSellIn() {
    	item = new Item("Aged Brie", 0, 10);
        gildedRose = new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(-1, item.sellIn);
        assertEquals(12, item.quality);
    }

    @Test
    void testBackstagePassesBeforeSellIn() {
    	item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        gildedRose = new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(14, item.sellIn);
        assertEquals(21, item.quality);
    }

    @Test
    void testBackstagePassesTenDaysOrLess() {
    	item = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20);
        gildedRose = new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(8, item.sellIn);
        assertEquals(22, item.quality);
    }

    @Test
    void testBackstagePassesFiveDaysOrLess() {
    	item = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 20);
        gildedRose = new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(3, item.sellIn);
        assertEquals(23, item.quality);
    }

    @Test
    void testBackstagePassesAfterSellIn() {
    	item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        gildedRose = new GildedRose(new Item[] { item });
        gildedRose.updateQuality();

        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }

    @Test
    void testSulfurasDoesNotChange() {
    	item = new Item("Sulfuras, Hand of Ragnaros", 5, 80);
        gildedRose = new GildedRose(new Item[] { item });
        gildedRose.updateQuality ();

        assertEquals(5, item.sellIn);
        assertEquals(80, item.quality);
    }

}
