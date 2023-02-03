
package net.mcreator.wargle.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.wargle.world.inventory.BlueprintMakerGUIMenu;
import net.mcreator.wargle.procedures.BlueprintMakerButtonDisplayConditionProcedure;
import net.mcreator.wargle.network.BlueprintMakerGUIButtonMessage;
import net.mcreator.wargle.WargleMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BlueprintMakerGUIScreen extends AbstractContainerScreen<BlueprintMakerGUIMenu> {
	private final static HashMap<String, Object> guistate = BlueprintMakerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BlueprintMakerGUIScreen(BlueprintMakerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wargle:textures/screens/blueprint_maker_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		if (BlueprintMakerButtonDisplayConditionProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, "" + (entity.getPersistentData().getString("producedItem")) + "", 30, 66, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 32, this.topPos + 33, 98, 20, Component.literal("Make Blueprint"), e -> {
			if (BlueprintMakerButtonDisplayConditionProcedure.execute(world, x, y, z)) {
				WargleMod.PACKET_HANDLER.sendToServer(new BlueprintMakerGUIButtonMessage(0, x, y, z));
				BlueprintMakerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (BlueprintMakerButtonDisplayConditionProcedure.execute(world, x, y, z))
					super.render(ms, gx, gy, ticks);
			}
		});
	}
}
