
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wargle.item.TechChipItem;
import net.mcreator.wargle.item.TechCardItem;
import net.mcreator.wargle.item.StickOfRAMItem;
import net.mcreator.wargle.item.SiliconItem;
import net.mcreator.wargle.item.SiliconBoardItem;
import net.mcreator.wargle.item.ResearchTabletItem;
import net.mcreator.wargle.item.ResearchPrintItem;
import net.mcreator.wargle.item.PlasticPolymerItem;
import net.mcreator.wargle.item.GrapheneItem;
import net.mcreator.wargle.item.GoldWireItem;
import net.mcreator.wargle.item.CopperWireItem;
import net.mcreator.wargle.item.CircuitBoardItem;
import net.mcreator.wargle.item.CarbonPlateItem;
import net.mcreator.wargle.item.CarbonItem;
import net.mcreator.wargle.item.BlueprintItem;
import net.mcreator.wargle.item.BatteryItem;
import net.mcreator.wargle.item.AdvancedPlasticItem;
import net.mcreator.wargle.item.AdvancedPinSystemItem;
import net.mcreator.wargle.item.AABatteryItem;
import net.mcreator.wargle.WargleMod;

public class WargleModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WargleMod.MODID);
	public static final RegistryObject<Item> STICK_OF_RAM = REGISTRY.register("stick_of_ram", () -> new StickOfRAMItem());
	public static final RegistryObject<Item> TECH_CHIP = REGISTRY.register("tech_chip", () -> new TechChipItem());
	public static final RegistryObject<Item> TECH_CARD = REGISTRY.register("tech_card", () -> new TechCardItem());
	public static final RegistryObject<Item> CIRCUIT_BOARD = REGISTRY.register("circuit_board", () -> new CircuitBoardItem());
	public static final RegistryObject<Item> ADVANCED_PIN_SYSTEM = REGISTRY.register("advanced_pin_system", () -> new AdvancedPinSystemItem());
	public static final RegistryObject<Item> SILICON_BOARD = REGISTRY.register("silicon_board", () -> new SiliconBoardItem());
	public static final RegistryObject<Item> AA_BATTERY = REGISTRY.register("aa_battery", () -> new AABatteryItem());
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireItem());
	public static final RegistryObject<Item> CARBON_PLATE = REGISTRY.register("carbon_plate", () -> new CarbonPlateItem());
	public static final RegistryObject<Item> CARBON = REGISTRY.register("carbon", () -> new CarbonItem());
	public static final RegistryObject<Item> SILICON = REGISTRY.register("silicon", () -> new SiliconItem());
	public static final RegistryObject<Item> PLASTIC_POLYMER = REGISTRY.register("plastic_polymer", () -> new PlasticPolymerItem());
	public static final RegistryObject<Item> ADVANCED_PLASTIC = REGISTRY.register("advanced_plastic", () -> new AdvancedPlasticItem());
	public static final RegistryObject<Item> GRAPHENE = REGISTRY.register("graphene", () -> new GrapheneItem());
	public static final RegistryObject<Item> RESEARCH_BENCH = block(WargleModBlocks.RESEARCH_BENCH, WargleModTabs.TAB_EXPERIMENTAL);
	public static final RegistryObject<Item> RESEARCH_TABLET = REGISTRY.register("research_tablet", () -> new ResearchTabletItem());
	public static final RegistryObject<Item> BLUEPRINT_BUILDER = block(WargleModBlocks.BLUEPRINT_BUILDER, WargleModTabs.TAB_EXPERIMENTAL);
	public static final RegistryObject<Item> BLUEPRINT = REGISTRY.register("blueprint", () -> new BlueprintItem());
	public static final RegistryObject<Item> RESEARCH_PRINT = REGISTRY.register("research_print", () -> new ResearchPrintItem());
	public static final RegistryObject<Item> BLUEPRINT_MAKER = block(WargleModBlocks.BLUEPRINT_MAKER, WargleModTabs.TAB_EXPERIMENTAL);
	public static final RegistryObject<Item> GOLD_WIRE = REGISTRY.register("gold_wire", () -> new GoldWireItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
