package com.gildedrose;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.gildedrose.constants.GildedRoseApplicationConstant;
import com.gildedrose.itembuilder.Item;

/**
 * This class serves as the entry point for the Gilded Rose inventory management 
 * system. It initializes the items,simulates the passage of days, and updates the 
 * quality and sell-in values of the items in the inventory.
 */
public class GildedRoseApplicationRunner {
	
	 /**
     * The main method runs the application, simulating the Gilded Rose inventory system.
     *
     */
	public static void main(String... args) {
		
		// Initialize the array of items with predefined constants and values
		Item[] items = new Item[] { new Item(GildedRoseApplicationConstant.DEXTERITY_VEST, 10, 20), 
				new Item(GildedRoseApplicationConstant.AGED_BRIE, 2, 0),
				new Item(GildedRoseApplicationConstant.ELIXIR, 5, 7), 
				new Item(GildedRoseApplicationConstant.SULFURAS, 0, 80),
				new Item(GildedRoseApplicationConstant.SULFURAS, -1, 80),
				new Item(GildedRoseApplicationConstant.BACKSTAGE, 15, 20),
				new Item(GildedRoseApplicationConstant.BACKSTAGE, 10, 49),
				new Item(GildedRoseApplicationConstant.BACKSTAGE, 5, 49), 
				new Item(GildedRoseApplicationConstant.CONJURED, 10, 20) };
		// Create a GildedRose instance to manage the items
		GildedRose gildRoseItems = new GildedRose(items);

		IntStream.range(0, 31).forEach(day -> {
		    System.out.printf("-------- Day %d --------%n", day);
		    System.out.println("name, sellIn, quality");
		    // Print the details of all items
		    Arrays.stream(items).forEach(System.out::println);
		    System.out.println(); 
		    // Update the quality and sell-in values of all items
		    gildRoseItems.updateQuality(items); // Update all items
		});

	}
}
