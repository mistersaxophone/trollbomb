
package net.mcreator.wargle.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.wargle.init.WargleModTabs;

public class BlueprintItem extends Item {
	public BlueprintItem() {
		super(new Item.Properties().tab(WargleModTabs.TAB_EXPERIMENTAL).stacksTo(1).rarity(Rarity.COMMON));
	}
}
