package kan3.dnamod.world;

import kan3.dnamod.config.OregenConfig;
import kan3.dnamod.init.DNABlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration 
{
	public static void setupOreGeneration()
	{ 
		if(OregenConfig.generate_overworld.get())
		{
			for(Biome biome : ForgeRegistries.BIOMES)
			{
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, DNABlocks.fullerite_ore.getDefaultState(), OregenConfig.dna_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(2, 4, 4, 8)));				
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, DNABlocks.fullerite_ore_nether.getDefaultState(), OregenConfig.dna_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(16, 10, 10, 100)));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, DNABlocks.wurtzite_ore.getDefaultState(), OregenConfig.dna_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(6, 90, 90, 120)));				
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, DNABlocks.wurtzite_ore_nether.getDefaultState(), OregenConfig.dna_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(12, 100, 100, 200)));
				Biomes.DESERT.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, DNABlocks.oxmium_ore.getDefaultState(), OregenConfig.dna_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(1, 40, 40, 80)));
				Biomes.DESERT_HILLS.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, DNABlocks.oxmium_ore.getDefaultState(), OregenConfig.dna_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(1, 40, 40, 80)));
				Biomes.BEACH.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, DNABlocks.fossil_ore.getDefaultState(), OregenConfig.dna_lower_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(1, 30, 30, 50)));
				Biomes.RIVER.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, DNABlocks.fossil_ore.getDefaultState(), OregenConfig.dna_lower_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(1, 30, 30, 50)));
			}
		}
	}
}
