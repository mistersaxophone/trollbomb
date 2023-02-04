package net.mcreator.wargle.procedures;

import net.minecraft.world.item.ItemStack;

public class GargletasticalProcedure {
	public static String execute(String string) {
		return ForgeRegistries.ITEMS.getValue(new ResourceLocation(string));
	}
}
