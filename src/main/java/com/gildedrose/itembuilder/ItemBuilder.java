package com.gildedrose.itembuilder;

/**
 * This abstract class provides a blueprint for building and updating items in
 * the Gilded Rose inventory. Each specific type of item should extend this
 * class and implement its update behaviour.
 */
public interface ItemBuilder {
	
	void updateQuality(Item item);
}
