package com.gildedrose;

public class GildedRoseV2 {
	private Item[] items;

    public GildedRoseV2(Item[] items2) {
        this.items = items2;
    }

    public void updateQuality() {
        for (Item item : items) {
        	ItemBuilder buildItem = ItemAdder.buildItem(item);
        	buildItem.update();
        }
    }
}
