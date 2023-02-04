package net.mcreator.wargle.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class GargleCommandProcedureProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		String silly = "";
		String s2w = "";
		silly = StringArgumentType.getString(arguments, "s1");
		s2w = StringArgumentType.getString(arguments, "s2");
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags()
					.getTag(ItemTags.create(new ResourceLocation(((silly + ":" + s2w)).toLowerCase(java.util.Locale.ENGLISH))))
					.getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)));
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}
