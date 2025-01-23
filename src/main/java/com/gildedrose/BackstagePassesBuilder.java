package com.gildedrose;

public class BackstagePassesBuilder extends ItemBuilder{
	
	public BackstagePassesBuilder(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 10) {
                item.quality++;
            }
            if (item.sellIn < 5) {
                item.quality++;
            }
        }
    }


}
