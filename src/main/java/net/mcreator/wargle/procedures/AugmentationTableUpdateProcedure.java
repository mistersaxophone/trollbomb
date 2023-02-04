package net.mcreator.wargle.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.Map;

public class AugmentationTableUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack item = ItemStack.EMPTY;
		ItemStack augment = ItemStack.EMPTY;
		item = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY);
		if (item.is(ItemTags.create(new ResourceLocation("wargle:augmentable_armor")))) {
			augment = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY);
		}
	}
}
