package com.gildedrose.itembuilder;

public class BackstagePassesBuilder extends ItemBuilder {

	public BackstagePassesBuilder(Item item) {
		super(item);
	}

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
