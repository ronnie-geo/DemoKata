package com.gildedrose.itembuilder;

/**
 * This class is a specialised implementation of ItemBuilder for handling the
 * behavior of "Sulfuras" items.
 */
public class SulfurasBuilder implements ItemBuilder {
	/**
	 * Overrides the update method to reflect the behavior of "Sulfuras." "Sulfuras"
	 * items do not undergo any changes to their quality or sell-in values.
	 */
	@Override
	public void updateQuality(Item item) {
		// Sulfuras does not change
	}

}
