
package net.mcreator.wargle.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.wargle.init.WargleModTabs;

public class AABatteryItem extends Item {
	public AABatteryItem() {
		super(new Item.Properties().tab(WargleModTabs.TAB_AWESOMESHOP).stacksTo(64).rarity(Rarity.COMMON));
	}
}
