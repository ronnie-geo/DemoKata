package com.gildedrose;

public class DefaultItemBuilder extends ItemBuilder {

	public DefaultItemBuilder(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn--;
        if (item.quality > 0) {
            item.quality--;
        }
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }

}
