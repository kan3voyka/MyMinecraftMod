package kan3.dnamod.init;

import kan3.dnamod.DNAModRegistries;
import kan3.dnamod.entities.Mummy;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class DNAEntities 
{
	public static EntityType<?> MUMMY = EntityType.Builder.create(Mummy::new, EntityClassification.MONSTER).build(DNAModRegistries.MODID + ":mummy").setRegistryName(DNAModRegistries.location("mummy"));
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
				DNAItems.mummy_egg = registerEntitySpawnEgg(MUMMY, 0xC7AF70, 0x3C3A17, "mummy_egg")
		);
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(MUMMY, Biomes.DESERT_LAKES, Biomes.DESERT_HILLS, Biomes.DESERT);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) 
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(DNAModRegistries.DNA));
		item.setRegistryName(DNAModRegistries.location(name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 10));
			}
		}
	}
}
