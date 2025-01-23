package com.gildedrose;

public class Program {

	public static void main(String... args) {

		Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20), new Item("Aged Brie", 2, 0),
				new Item("Elixir of the Mongoose", 5, 7), new Item("Sulfuras, Hand of Ragnaros", 0, 80),
				new Item("Sulfuras, Hand of Ragnaros", -1, 80),
				new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49), new Item("Conjured Mana Cake", 10, 20) };

		// GildedRose app = new GildedRose(items);
		GildedRoseV2 gildRoseItems = new GildedRoseV2(items);

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
