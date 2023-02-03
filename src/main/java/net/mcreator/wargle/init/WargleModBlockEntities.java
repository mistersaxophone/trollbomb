
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.wargle.block.entity.ResearchBenchBlockEntity;
import net.mcreator.wargle.block.entity.BlueprintMakerBlockEntity;
import net.mcreator.wargle.block.entity.BlueprintBuilderBlockEntity;
import net.mcreator.wargle.WargleMod;

public class WargleModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WargleMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RESEARCH_BENCH = register("research_bench", WargleModBlocks.RESEARCH_BENCH,
			ResearchBenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLUEPRINT_BUILDER = register("blueprint_builder", WargleModBlocks.BLUEPRINT_BUILDER,
			BlueprintBuilderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLUEPRINT_MAKER = register("blueprint_maker", WargleModBlocks.BLUEPRINT_MAKER,
			BlueprintMakerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
