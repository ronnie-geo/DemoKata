package com.gildedrose;

import com.gildedrose.itembuilder.Item;
import com.gildedrose.itembuilder.ItemAdder;
import com.gildedrose.itembuilder.ItemBuilder;

/**
 * This class manages and updates the quality and sell-in values of items in 
 * the Gilded Rose inventory.
 */
public class GildedRose {
    /**
     * Array of items managed by the Gilded Rose.
     */
    private Item[] items;

    /**
     * Constructs a new GildedRose instance with the given array of items.
     *
     * @param items The array of objects to be managed.
     */
    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * Updates the quality and sell-in values of all items in the inventory.
     * This method iterates through each item, processes it 
     *  and updates it based on its rules.
     */
    public void updateQuality() {
        for (Item item : items) {
            ItemBuilder buildItem = ItemAdder.buildItem(item);
            buildItem.update();
        }
    }
}
