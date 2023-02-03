
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WargleModTabs {
	public static CreativeModeTab TAB_EXPERIMENTAL;
	public static CreativeModeTab TAB_AWESOMESHOP;

	public static void load() {
		TAB_EXPERIMENTAL = new CreativeModeTab("tabexperimental") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WargleModItems.BLUEPRINT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AWESOMESHOP = new CreativeModeTab("tabawesomeshop") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WargleModItems.COPPER_WIRE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
