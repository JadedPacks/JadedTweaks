package com.jadedpacks.jctweaks.helpers;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class HarvestCraftHelper {
	public static void init() {
		addRecipes();
	}

	private static void addRecipes() {
		if(Parts.claywater != null && (Parts.freshwater != null)) {
			RecipeRemover.removeAnyRecipe(Parts.fwater);
			RecipeRemover.removeAnyRecipe(Parts.freshwater);
			GameRegistry.addRecipe(Parts.freshwater, "F", 'F', Parts.claywater);
			GameRegistry.addRecipe(Parts.freshwater, "B", 'B', Parts.bucketwater);

		}
		if(Loader.isModLoaded("Botania")) {
			if(OreDictionary.getOres("listAllgrain").size() > 0) {
				GameRegistry.addRecipe(new ShapelessOreRecipe(Parts.flour, Parts.woodmortar, "listAllgrain"));
			} else {
				GameRegistry.addRecipe(Parts.flour, "MG", 'M', Parts.woodmortar, 'G', Parts.wheat);
			}
		}
		if(OreDictionary.getOres("toolMortarandpestle").size() > 0) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(Parts.flour, "toolMortarandpestle", "cropPotato"));
		}
		Main.log.info("Harvestcraft Tweaks Loaded");
	}
}