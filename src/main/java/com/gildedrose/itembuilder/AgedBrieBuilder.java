package com.gildedrose.itembuilder;

/**
 * This class is a specialized implementation of the ItemBuilder for handling
 * the behavior of the "Aged Brie" item. "Aged Brie" increases in quality as it
 * ages, with a maximum quality of 50. The rate of increase doubles once the
 * sell-by date has passed.
 */
public class AgedBrieBuilder implements ItemBuilder {
	/**
	 * Updates the quality and sell-in values of the "Aged Brie" item. Decreases the
	 * sell-in value by 1. Increases the quality by 1 if the sell-in date is not
	 * passed. Increases the quality by 2 if the sell-in date is passed. Ensures
	 * that the quality never exceeds 50.
	 */

	@Override
	public void updateQuality(Item item) {
		item.sellIn--;
		item.quality = Math.min(50, item.quality + (item.sellIn < 0 ? 2 : 1));
	}
}
