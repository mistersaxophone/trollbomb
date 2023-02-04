
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.wargle.world.inventory.ResearchGUIMenu;
import net.mcreator.wargle.world.inventory.BlueprintMakerGUIMenu;
import net.mcreator.wargle.world.inventory.BlueprintBuilderGUIMenu;
import net.mcreator.wargle.world.inventory.AugmentationTableGUIMenu;
import net.mcreator.wargle.WargleMod;

public class WargleModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WargleMod.MODID);
	public static final RegistryObject<MenuType<ResearchGUIMenu>> RESEARCH_GUI = REGISTRY.register("research_gui",
			() -> IForgeMenuType.create(ResearchGUIMenu::new));
	public static final RegistryObject<MenuType<BlueprintBuilderGUIMenu>> BLUEPRINT_BUILDER_GUI = REGISTRY.register("blueprint_builder_gui",
			() -> IForgeMenuType.create(BlueprintBuilderGUIMenu::new));
	public static final RegistryObject<MenuType<BlueprintMakerGUIMenu>> BLUEPRINT_MAKER_GUI = REGISTRY.register("blueprint_maker_gui",
			() -> IForgeMenuType.create(BlueprintMakerGUIMenu::new));
	public static final RegistryObject<MenuType<AugmentationTableGUIMenu>> AUGMENTATION_TABLE_GUI = REGISTRY.register("augmentation_table_gui",
			() -> IForgeMenuType.create(AugmentationTableGUIMenu::new));
}
