package com.gildedrose.itembuilder;

/*
 * This class represents an Item.Each item has a name, a number of days to sell (sellIn), 
 * and a quality value.
 */
public class Item {
	
    /*
     * The name of the Item
     */
    public String name;
    
    /*
     * The number of days to sell the item. This values decreases daily.
     */
    public int sellIn;
    /**
     * The quality of the item.Its value may decrease or increase based on sellIn    
     */
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
