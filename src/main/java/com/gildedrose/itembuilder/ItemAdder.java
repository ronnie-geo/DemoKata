package com.gildedrose.itembuilder;

import com.gildedrose.constants.GildedRoseApplicationConstant;

/**
 * This class acts as a factory for creating specialized builders for different item types 
 */
public class ItemAdder {
	
	 /**
     * Builds and returns an appropriate ItemBuilderfor the given Item.
     * The item type is determined by its name, and the corresponding builder is returned.
     *
     * @param item The Item to be wrapped in an ItemBuilder.
     * @return An ItemBuilder instance specific to the item's type.
     */
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
