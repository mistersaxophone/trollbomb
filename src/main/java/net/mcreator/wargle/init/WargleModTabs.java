
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WargleModTabs {
	public static CreativeModeTab TAB_EXPERIMENTAL;

	public static void load() {
		TAB_EXPERIMENTAL = new CreativeModeTab("tabexperimental") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WargleModItems.BATTERY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
