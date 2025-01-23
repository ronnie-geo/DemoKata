package com.gildedrose.itembuilder;

public abstract class ItemBuilder {

	protected Item item;

	public ItemBuilder(Item item) {
		this.item = item;
	}

	public abstract void update();
}
