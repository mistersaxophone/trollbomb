
package net.mcreator.wargle.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.wargle.init.WargleModTabs;

public class SiliconBoardItem extends Item {
	public SiliconBoardItem() {
		super(new Item.Properties().tab(WargleModTabs.TAB_AWESOMESHOP).stacksTo(64).rarity(Rarity.COMMON));
	}
}
