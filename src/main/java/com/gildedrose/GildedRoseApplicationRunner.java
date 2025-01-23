package com.gildedrose;

import com.gildedrose.constants.GildedRoseApplicationConstant;
import com.gildedrose.itembuilder.Item;

public class GildedRoseApplicationRunner {

	public static void main(String... args) {

		Item[] items = new Item[] { new Item(GildedRoseApplicationConstant.DEXTERITY_VEST, 10, 20), 
				new Item(GildedRoseApplicationConstant.AGED_BRIE, 2, 0),
				new Item(GildedRoseApplicationConstant.ELIXIR, 5, 7), 
				new Item(GildedRoseApplicationConstant.SULFURAS, 0, 80),
				new Item(GildedRoseApplicationConstant.SULFURAS, -1, 80),
				new Item(GildedRoseApplicationConstant.BACKSTAGE, 15, 20),
				new Item(GildedRoseApplicationConstant.BACKSTAGE, 10, 49),
				new Item(GildedRoseApplicationConstant.BACKSTAGE, 5, 49), 
				new Item(GildedRoseApplicationConstant.CONJURED, 10, 20) };

		GildedRose gildRoseItems = new GildedRose(items);

		for (int i = 0; i < 31; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			for (int j = 0; j < items.length; j++) {
				System.out.println(items[j]);
			}
			System.out.println("");
			gildRoseItems.updateQuality();
		}
	}
}
