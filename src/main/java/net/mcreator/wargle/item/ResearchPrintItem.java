
package net.mcreator.wargle.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.wargle.init.WargleModTabs;

public class ResearchPrintItem extends Item {
	public ResearchPrintItem() {
		super(new Item.Properties().tab(WargleModTabs.TAB_EXPERIMENTAL).stacksTo(1).rarity(Rarity.COMMON));
	}
}
