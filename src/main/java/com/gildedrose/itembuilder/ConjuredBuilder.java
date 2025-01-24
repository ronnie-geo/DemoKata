package com.gildedrose.itembuilder;

/**
 * This class is a specialised implementation of ItemBuilder for handling the 
 * behavior of "Conjured" items.
 */
public class ConjuredBuilder extends ItemBuilder {

	public ConjuredBuilder(Item item) {
		super(item);
	}

	/**
	 * Updates the quality and sell-in values of the "Conjured" item. Decreases the
	 * sell-in value by 1. Decreases the quality by 2 if the sell-in value is 0 or
	 * greater. Decreases the quality by 4 if the sell-in value is less than 0.
	 * Ensures the quality does not drop below 0.
	 */
	@Override
	public void update() {
		item.sellIn--;
		item.quality = Math.max(0, item.quality - (item.sellIn < 0 ? 4 : 2));
	}
}
