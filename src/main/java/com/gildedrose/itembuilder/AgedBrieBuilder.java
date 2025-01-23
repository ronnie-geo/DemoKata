package com.gildedrose.itembuilder;

public class AgedBrieBuilder extends ItemBuilder {
	 public AgedBrieBuilder(Item item) {
	        super(item);
	    }
	    @Override
	    public void update() {
	        item.sellIn--;
			item.quality = Math.min(50, item.quality + (item.sellIn < 0 ? 2 : 1));
	    }


}
