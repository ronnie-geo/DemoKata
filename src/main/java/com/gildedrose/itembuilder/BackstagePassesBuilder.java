package com.gildedrose.itembuilder;

/**
 * This class is a specialised implementation of ItemBuilder for handling the
 * behaviour of "Backstage passes to a TAFKAL80ETC concert".
 */
public class BackstagePassesBuilder extends ItemBuilder {

	public BackstagePassesBuilder(Item item) {
		super(item);
	}

	/**
	 * Updates the quality and sell-in values of the backstage pass item. Decreases
	 * the sell-in value by 1. If the sell-in value is less than 0, sets the quality
	 * to 0. Otherwise, increases the quality based on the sell-in value:
	 * 
	 * Ensures the quality does not exceed 50.</li>
	 */
	@Override
	public void update() {
		item.sellIn--;

		if (item.sellIn < 0) {
			item.quality = 0;
			return;
		}

		if (item.quality < 50) {
			item.quality += (item.sellIn < 5) ? 3 : (item.sellIn < 10) ? 2 : 1;
			item.quality = Math.min(50, item.quality);
		}
	}
}
