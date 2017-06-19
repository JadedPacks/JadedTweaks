package com.jadedpacks.jctweaks;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class Config {
	public boolean Thaumcraft, ThermalExpansion, MFR, BloodMagic, Botania, HarvestCraft, SolarFlux, TinkersConstruct, Vanilla;
	private Configuration configuration;

	public Config(File configFile) {
		configuration = new Configuration(configFile);
		configuration.load();
		genConfig();
	}

	public void saveConfigs() {
		configuration.save();
	}

	private void genConfig() {
		ThermalExpansion = configuration.get("general", "ThermalExpansion", true).getBoolean(true);
		Thaumcraft = configuration.get("general", "Thaumcraft", true).getBoolean(true);
		MFR = configuration.get("general", "MFR", true).getBoolean(true);
		BloodMagic = configuration.get("general", "BloodMagic", true).getBoolean(true);
		Botania = configuration.get("general", "Botania", true).getBoolean(true);
		HarvestCraft = configuration.get("general", "HarvestCraft", true).getBoolean(true);
		SolarFlux = configuration.get("general", "SolarFlux", true).getBoolean(true);
		TinkersConstruct = configuration.get("general", "TinkersConstruct", true).getBoolean(true);
		Vanilla = configuration.get("general", "Vanilla", true).getBoolean(true);
	}
}