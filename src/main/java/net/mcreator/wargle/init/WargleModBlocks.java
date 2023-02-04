
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wargle.block.ResearchBenchBlock;
import net.mcreator.wargle.block.BlueprintMakerBlock;
import net.mcreator.wargle.block.BlueprintBuilderBlock;
import net.mcreator.wargle.block.AugmentationTableBlock;
import net.mcreator.wargle.WargleMod;

public class WargleModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WargleMod.MODID);
	public static final RegistryObject<Block> RESEARCH_BENCH = REGISTRY.register("research_bench", () -> new ResearchBenchBlock());
	public static final RegistryObject<Block> BLUEPRINT_BUILDER = REGISTRY.register("blueprint_builder", () -> new BlueprintBuilderBlock());
	public static final RegistryObject<Block> BLUEPRINT_MAKER = REGISTRY.register("blueprint_maker", () -> new BlueprintMakerBlock());
	public static final RegistryObject<Block> AUGMENTATION_TABLE = REGISTRY.register("augmentation_table", () -> new AugmentationTableBlock());
}
