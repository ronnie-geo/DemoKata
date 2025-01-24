package com.gildedrose.itembuilder;

/**
 * This abstract class provides a blueprint for building and updating items in
 * the Gilded Rose inventory. Each specific type of item should extend this
 * class and implement its update behaviour.
 */
public abstract class ItemBuilder {
	/**
	 * the instance that this builder operates on.
	 */
	protected Item item;

	public ItemBuilder(Item item) {
		this.item = item;
	}

	/**
	 * Abstract method to update the item's quality and sell-in values. Each
	 * subclass must provide its own implementation based on the rules for the
	 * specific type of item.
	 */
	public abstract void update();
}
