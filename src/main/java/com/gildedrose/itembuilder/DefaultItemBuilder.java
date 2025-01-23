package com.gildedrose.itembuilder;

public class DefaultItemBuilder extends ItemBuilder {

	public DefaultItemBuilder(Item item) {
		super(item);
	}

	@Override
	public void update() {
		item.sellIn--;
		item.quality = (Math.max(0, item.quality - (item.sellIn < 0 ? 2 : 1)));
	}

}
