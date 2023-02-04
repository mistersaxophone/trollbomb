
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wargle.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.wargle.client.gui.ResearchGUIScreen;
import net.mcreator.wargle.client.gui.BlueprintMakerGUIScreen;
import net.mcreator.wargle.client.gui.BlueprintBuilderGUIScreen;
import net.mcreator.wargle.client.gui.AugmentationTableGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WargleModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WargleModMenus.RESEARCH_GUI.get(), ResearchGUIScreen::new);
			MenuScreens.register(WargleModMenus.BLUEPRINT_BUILDER_GUI.get(), BlueprintBuilderGUIScreen::new);
			MenuScreens.register(WargleModMenus.BLUEPRINT_MAKER_GUI.get(), BlueprintMakerGUIScreen::new);
			MenuScreens.register(WargleModMenus.AUGMENTATION_TABLE_GUI.get(), AugmentationTableGUIScreen::new);
		});
	}
}
