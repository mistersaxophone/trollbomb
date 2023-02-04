
package net.mcreator.wargle.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.wargle.init.WargleModTabs;

public class DefenseGemItem extends Item {
	public DefenseGemItem() {
		super(new Item.Properties().tab(WargleModTabs.TAB_EXPERIMENTAL).stacksTo(64).rarity(Rarity.COMMON));
	}
}
