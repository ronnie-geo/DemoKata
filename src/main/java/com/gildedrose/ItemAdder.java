package com.gildedrose;

public class ItemAdder {

	public static ItemBuilder buildItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieBuilder(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesBuilder(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasBuilder(item);
            case "Conjured Mana Cake":
            	return new ConjuredBuilder(item);
            default:
                return new DefaultItemBuilder(item);
        }
    }

}
