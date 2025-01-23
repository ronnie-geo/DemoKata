package com.gildedrose;

public class ConjuredBuilder extends ItemBuilder {
	
	public ConjuredBuilder(Item item) {
		super(item);
		
	}

	@Override
	public void update() {
		item.sellIn --;
		if(item.quality >0) {
			item.quality -= 2;
		if(item.sellIn <0) {
			item.quality -= 2;
		}
		}
	}

}
