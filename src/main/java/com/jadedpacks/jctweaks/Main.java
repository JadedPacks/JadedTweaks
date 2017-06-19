package com.jadedpacks.jctweaks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jadedpacks.jctweaks.helpers.*;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;

@Mod(modid = "jctweaks", version = "@VERSION@", name = "JadedTweaks", dependencies = "required-after:Forge@[10.13.3.1384,11.14);" + "after:*;")
public class Main {
	public static final Logger log = LogManager.getLogger("JadedTweaks");

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ItemStackHolderInjector.INSTANCE.inject();
		Main.log.info("parts");
		if(Loader.isModLoaded("ThermalExpansion")) {
			ThermalExpansionHelper.init();
		}
		if(Loader.isModLoaded("Thaumcraft")) {
			ThaumcraftHelper.init();
		}
		if(Loader.isModLoaded("TConstruct")) {
			TinkersConstructHelper.init();
		}
		if(Loader.isModLoaded("MineFactoryReloaded")) {
			MFRHelper.init();
		}
		if(Loader.isModLoaded("AWWayofTime")) {
			BloodMagicHelper.init();
		}
		if(Loader.isModLoaded("harvestcraft")) {
			HarvestCraftHelper.init();
		}
		if(Loader.isModLoaded("customnpcs")) {
			CustomNpcsHelper.init();
		}
		if(Loader.isModLoaded("exnihilo")) {
			ExNihiloHelper.init();
		}
		OreDictionaryTweaks.init();
		Basic.init();
	}
}