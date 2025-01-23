package com.gildedrose;

import java.util.Arrays;
import java.util.stream.IntStream;

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

		IntStream.range(0, 31).forEach(day -> {
		    System.out.printf("-------- Day %d --------%n", day);
		    System.out.println("name, sellIn, quality");
		    Arrays.stream(items).forEach(System.out::println);
		    System.out.println(); 
		    gildRoseItems.updateQuality(); // Update all items
		});

	}
}
