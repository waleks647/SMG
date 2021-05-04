package me.waleks.simplematerialgenerators.items;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.BlockInventoryHolder;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;

public class MaterialGenerator extends SlimefunItem{
	
	int rate = 1;
	int count = 0;
	
	ItemStack material;
	
	public MaterialGenerator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {

            @Override
            public void tick(Block b, SlimefunItem sf, Config data) {
                MaterialGenerator.this.tick(b);
            }

            @Override
            public boolean isSynchronized() {
                return true;
            }
        });
    }

	public void tick(Block b) {
		Block targetBlock = b.getRelative(BlockFace.UP);
		if (targetBlock.getType() == Material.CHEST) {
			BlockState state = targetBlock.getState();
			if (state instanceof InventoryHolder) {
				Inventory inv = ((InventoryHolder) state).getInventory();
				if (inv.firstEmpty() != -1) {
					if (count >= rate) {
						count = 0;
						inv.addItem(material);
					} else {
						count = count+1;
					}
				}
			}
		}
	}
	
	public final MaterialGenerator setItem(String itemSet) {
		
		this.material = new ItemStack(Material.getMaterial(itemSet));
		return this;
	}
	
	public final MaterialGenerator setRate(int rateTicks) {
		
		if (rateTicks >= 1) {this.rate = rateTicks;} else {this.rate = 1;}
		return this;
		
	}
}

