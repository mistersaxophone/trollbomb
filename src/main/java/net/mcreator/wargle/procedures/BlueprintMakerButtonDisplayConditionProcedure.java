package net.mcreator.wargle.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlueprintMakerButtonDisplayConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean bruh = false;
		bruh = true;
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "producedItem")).equals("#")) {
			bruh = false;
		}
		return bruh;
	}
}