package com.jadedpacks.jctweaks.helpers;

import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jctweaks.Main;

import net.minecraft.init.Blocks;
import exnihilo.registries.SieveRegistry;

public class ExNihiloHelper {
	public static void init() {
		addRecipes();
	}

	private static void addRecipes() {
		// remove exnihilo seeds replace with AgriCraft versions
		SieveRegistry.unregisterReward(Blocks.dirt, 0, Parts.carrot.getItem(), 0);
		SieveRegistry.unregisterReward(Blocks.dirt, 0, Parts.sugarcane.getItem(), 0);
		SieveRegistry.unregisterReward(Blocks.dirt, 0, Parts.cactus.getItem(), 0);
		SieveRegistry.unregisterReward(Blocks.dirt, 0, Parts.potato.getItem(), 0);
		SieveRegistry.register(Blocks.dirt, 0, Parts.carrot1.getItem(), 0, 15);
		SieveRegistry.register(Blocks.dirt, 0, Parts.sugarcane1.getItem(), 0, 32);
		SieveRegistry.register(Blocks.dirt, 0, Parts.cactus1.getItem(), 0, 32);
		SieveRegistry.register(Blocks.dirt, 0, Parts.potato1.getItem(), 0, 15);
		// add sieve recipes podzol - botania seeds
		if(Parts.bwhite != null) {
			SieveRegistry.register(Blocks.dirt, 2, Parts.bwhite.getItem(), 0, 15);
			SieveRegistry.register(Blocks.dirt, 2, Parts.bmagenta.getItem(), 0, 15);
			SieveRegistry.register(Blocks.dirt, 2, Parts.blightblue.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.byellow.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.blime.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bpink.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bgray.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.blightgray.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bpurple.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bblue.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bbrown.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bgreen.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bred.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bblack.getItem(), 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.borange.getItem(), 0, 15);
		} else {
			Main.log.info("Botania Seeds are missing");
		}
		// add ghast tears from soulsand sieving
		SieveRegistry.register(Blocks.soul_sand, Parts.ghast.getItem(), 0, 20);
		SieveRegistry.register(Blocks.soul_sand, Parts.sulfur.getItem(), 16, 15);
		SieveRegistry.register(Blocks.soul_sand, Parts.weakblood.getItem(), 0, 32);
		SieveRegistry.register(Blocks.snow, Parts.blizz.getItem(), 1025, 64);
		SieveRegistry.register(Parts.crnether, Parts.sulfur.getItem(), 16, 8);
		SieveRegistry.register(Parts.crnether, Parts.ghast.getItem(), 0, 15);
		SieveRegistry.register(Parts.crnether, Parts.glowstone.getItem(), 0, 32);
		SieveRegistry.register(Parts.heatsand, Parts.sulfur.getItem(), 16, 15);
		SieveRegistry.register(Parts.heatsand, Parts.yellorium.getItem(), 4, 32);
		SieveRegistry.register(Parts.heatsand, Parts.weakblood.getItem(), 0, 32);
		SieveRegistry.register(Blocks.gravel, Parts.lapis.getItem(), 4, 15);
		SieveRegistry.register(Blocks.gravel, Parts.diamond.getItem(), 0, 90);
		SieveRegistry.register(Blocks.gravel, Parts.emerald.getItem(), 0, 90);
	}
}