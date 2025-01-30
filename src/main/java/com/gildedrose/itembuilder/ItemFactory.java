package com.gildedrose.itembuilder;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.constants.GildedRoseApplicationConstant;

public class ItemFactory {
	private static final Map<String,ItemBuilder> itemBuildermap = new HashMap<String,ItemBuilder>();
	
	static {
		itemBuildermap.put(GildedRoseApplicationConstant.AGED_BRIE,new AgedBrieBuilder());
		itemBuildermap.put(GildedRoseApplicationConstant.BACKSTAGE,new BackstagePassesBuilder());
		itemBuildermap.put(GildedRoseApplicationConstant.SULFURAS,new SulfurasBuilder());
		itemBuildermap.put(GildedRoseApplicationConstant.CONJURED,new ConjuredBuilder());
	}
   
	public static ItemBuilder getItemBuilderMap(Item item) {
		return itemBuildermap.getOrDefault(item.name, new DefaultItemBuilder());
	}
}
