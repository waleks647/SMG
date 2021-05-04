package me.waleks.simplematerialgenerators;

import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public final class SMGItems {

	private SMGItems() {}

	public static final Category SMGItemCategory = new Category(
		new NamespacedKey(SimpleMaterialGenerators.getInstance(),"simplematerialgenerators"),
		new CustomItem(Material.SMOOTH_STONE, "&9Simple Material Generators")
	    );

	public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
		"SMG_GENERATOR_MULTIBLOCK",
		Material.SMOOTH_STONE,
		"&9Generator multiblock","",
		"&dBuild any of this addon\'s",
		"&dgenerators like this.",
		"&aThey will only output to a chest",
		"&adirectly above it."
		);
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&9Generates &6&9/&6t",
		"","&9&oSimpleMaterialGenerators");
	
	
	*/

	public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
		"SMG_GENERATOR_COBBLESTONE",
		Material.COBBLESTONE,
		"&7Cobblestone generator",
		"&9Generates &6Cobblestone&9/&6t",
		"","&9&oSimpleMaterialGenerators");

	public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
		"SMG_GENERATOR_STONE",
		Material.STONE,
		"&7Stone generator",
		"&9Generates &6Stone&9/&62t",
		"","&9&oSimpleMaterialGenerators");
	
	public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
		"SMG_GENERATOR_SMOOTH_STONE",
		Material.SMOOTH_STONE,
		"&7Smooth stone generator",
		"&9Generates &6Smooth stone&9/&63t",
		"","&9&oSimpleMaterialGenerators");
	
	public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
		"SMG_GENERATOR_GRAVEL",
		Material.ANDESITE,
		"&7Gravel generator",
		"&9Generates &6Gravel&9/&62t",
		"","&9&oSimpleMaterialGenerators");
	
	public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
		"SMG_GENERATOR_SAND",
		Material.CUT_SANDSTONE,
		"&eSand generator",
		"&9Generates &6Sand&9/&63t",
		"","&9&oSimpleMaterialGenerators");
	
	public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
		"SMG_GENERATOR_GLASS",
		Material.GLASS,
		"&fGlass generator",
		"&9Generates &6Glass&9/&64t",
		"","&9&oSimpleMaterialGenerators");
	
	public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
		"SMG_GENERATOR_NETHERRACK",
		Material.NETHERRACK,
		"&cNetherrack generator",
		"&9Generates &6Netherrack&9/&6t",
		"","&9&oSimpleMaterialGenerators");
	
	public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
		"SMG_GENERATOR_SOUL_SAND",
		Material.SOUL_SOIL,
		"&8Soul sand generator",
		"&9Generates &6Soul sand&9/&62t",
		"","&9&oSimpleMaterialGenerators");
	
	
}