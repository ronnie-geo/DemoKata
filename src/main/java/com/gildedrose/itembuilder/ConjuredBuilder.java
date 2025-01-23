package com.gildedrose.itembuilder;

public class ConjuredBuilder extends ItemBuilder {

	public ConjuredBuilder(Item item) {
		super(item);
	}

	@Override
	public void update() {
		item.sellIn--;
		item.quality = Math.max(0, item.quality - (item.sellIn < 0 ? 4 : 2));
	}
}
