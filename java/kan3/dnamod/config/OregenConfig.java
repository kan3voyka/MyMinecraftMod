package kan3.dnamod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig 
{
	public static ForgeConfigSpec.IntValue dna_lower_chance;
	public static ForgeConfigSpec.IntValue dna_chance;
	public static ForgeConfigSpec.IntValue dna_higher_chance;
	public static ForgeConfigSpec.BooleanValue generate_overworld;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		server.comment("Oregen Config");
		
		dna_lower_chance = server
				.comment("Lower maximum number of ore DNA ores that can spawn in one chunk")
				.defineInRange("oregen.dna_chance", 1, 1, 2);
		
		dna_chance = server
				.comment("Maximum number of ore DNA ores that can spawn in one chunk")
				.defineInRange("oregen.dna_chance", 2, 1, 4);
		
		dna_higher_chance = server
				.comment("Higher maximum number of DNA ores that can spawn in one chunk")
				.defineInRange("oregen.dna_higher_chance", 4, 1, 8);
		
		generate_overworld = server
				.comment("Decide if you want DNA ores to spawn in the Overworld")
				.define("oregen.generate_overworld", true);
	}
}