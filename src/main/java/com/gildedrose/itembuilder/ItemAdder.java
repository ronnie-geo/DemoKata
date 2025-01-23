package com.gildedrose.itembuilder;

import com.gildedrose.constants.GildedRoseApplicationConstant;

public class ItemAdder {

	public static ItemBuilder buildItem(Item item) {
        switch (item.name) {
            case GildedRoseApplicationConstant.AGED_BRIE:
                return new AgedBrieBuilder(item);
            case GildedRoseApplicationConstant.BACKSTAGE:
                return new BackstagePassesBuilder(item);
            case GildedRoseApplicationConstant.SULFURAS:
                return new SulfurasBuilder(item);
            case GildedRoseApplicationConstant.CONJURED:
            	return new ConjuredBuilder(item);
            default:
                return new DefaultItemBuilder(item);
        }
    }

}
