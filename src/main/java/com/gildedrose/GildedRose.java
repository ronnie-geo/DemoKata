package com.gildedrose;

import com.gildedrose.itembuilder.Item;
import com.gildedrose.itembuilder.ItemAdder;
import com.gildedrose.itembuilder.ItemBuilder;

public class GildedRose {
	private Item[] items;

    public GildedRose(Item[] items2) {
        this.items = items2;
    }

    public void updateQuality() {
        for (Item item : items) {
        	ItemBuilder buildItem = ItemAdder.buildItem(item);
        	buildItem.update();
        }
    }
}
