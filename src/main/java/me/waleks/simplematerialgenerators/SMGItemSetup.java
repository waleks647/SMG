package me.waleks.simplematerialgenerators;

import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import me.waleks.simplematerialgenerators.items.GeneratorMultiblock;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class SMGItemSetup {

	private SMGItemSetup() {}

	public static void setup(@Nonnull SimpleMaterialGenerators plugin) {

		new GeneratorMultiblock(SMGItems.SMGItemCategory, SMGItems.SMG_GENERATOR_MULTIBLOCK).register(plugin);

		/*	Template for adding more items
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem("")
		.setRate(1)
		.register(plugin);
		
		
		*/
		
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_COBBLESTONE,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
		 		new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.GLASS), new ItemStack(Material.WATER_BUCKET),
		 		new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE)
		 	})
		.setItem("COBBLESTONE")
		.setRate(1)
		.register(plugin);

		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_STONE,
			RecipeType.SMELTERY,
			new ItemStack[] {
				SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem("STONE")
		.setRate(2)
		.register(plugin);
		
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_SMOOTH_STONE,
			RecipeType.SMELTERY,
			new ItemStack[] {
				SMGItems.SMG_GENERATOR_STONE, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem("SMOOTH_STONE")
		.setRate(3)
		.register(plugin);
		
		
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_GRAVEL,
			RecipeType.GRIND_STONE,
			new ItemStack[] {
				SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
		 		null, null, null,
		 		null, null, null
		 	})
		.setItem("GRAVEL")
		.setRate(2)
		.register(plugin);
		
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_SAND,
			RecipeType.ORE_CRUSHER,
			new ItemStack[] {
				SMGItems.SMG_GENERATOR_GRAVEL, null, null,
		 		null, null, null,
		 		null, null, null
		 	})
		.setItem("SAND")
		.setRate(3)
		.register(plugin);

		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_GLASS,
			RecipeType.SMELTERY,
			new ItemStack[] {
				SMGItems.SMG_GENERATOR_SAND, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem("GLASS")
		.setRate(4)
		.register(plugin);
		
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_NETHERRACK,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, SMGItems.SMG_GENERATOR_STONE, null,
				SMGItems.SMG_GENERATOR_STONE, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_STONE,
		 		null, SMGItems.SMG_GENERATOR_STONE, null
		 	})
		.setItem("NETHERRACK")
		.setRate(1)
		.register(plugin);
		
		new MaterialGenerator(SMGItems.SMGItemCategory,
			SMGItems.SMG_GENERATOR_SOUL_SAND,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, SMGItems.SMG_GENERATOR_SAND, null,
				null, SlimefunItems.COMPOSTER, null,
		 		null, SMGItems.SMG_GENERATOR_SAND, null
		 	})
		.setItem("SOUL_SAND")
		.setRate(2)
		.register(plugin);
		
		

	}
}