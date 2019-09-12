package kan3.dnamod;

import org.apache.logging.log4j.Logger;

import kan3.dnamod.init.DNAArmorMaterials;
import kan3.dnamod.init.DNABlocks;
import kan3.dnamod.init.DNAEntities;
import kan3.dnamod.init.DNAItems;
import kan3.dnamod.init.DNAToolMaterials;
import kan3.dnamod.items.tools.OreExtractor;
import kan3.dnamod.items.tools.OxmiumExtractor;
import kan3.dnamod.items.tools.OxmiumSword;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class DNAModRegistries 
{
	public static final String MODID = DNAMod.MODID;
	public static final Logger LOGGER = DNAMod.LOGGER;
	public static final ItemGroup DNA = DNAMod.DNA;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			DNAItems.tutorial_item = new Item(new Item.Properties().group(DNA)).setRegistryName(location("tutorial_item")),
				
			DNAItems.fullerite_ingot = new Item(new Item.Properties().group(DNA)).setRegistryName(location("fullerite_ingot")),
			DNAItems.wurtzite_ingot = new Item(new Item.Properties().group(DNA)).setRegistryName(location("wurtzite_ingot")),
			DNAItems.oxmium_crystal = new Item(new Item.Properties().group(DNA)).setRegistryName(location("oxmium_crystal")),
			DNAItems.oxmium_shard = new Item(new Item.Properties().group(DNA)).setRegistryName(location("oxmium_shard")),
			
			DNAItems.ore_extractor = new OreExtractor(ItemTier.IRON, 1, -2.8f, new Item.Properties().group(DNA)).setRegistryName(location("ore_extractor")),
			DNAItems.fullerite_axe = new AxeItem(DNAToolMaterials.fullerite, 5.0f, -3.0f, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_axe")),
			DNAItems.fullerite_pickaxe = new PickaxeItem(DNAToolMaterials.fullerite, 1, -2.8f, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_pickaxe")),
			DNAItems.fullerite_shovel = new ShovelItem(DNAToolMaterials.fullerite, -1.0f, -2.6f, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_shovel")),
			DNAItems.fullerite_sword = new SwordItem(DNAToolMaterials.fullerite, 3, -2.4f, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_sword")),
			DNAItems.wurtzite_axe = new AxeItem(DNAToolMaterials.wurtzite, 5.0f, -3.0f, new Item.Properties().group(DNA)).setRegistryName(location("wurtzite_axe")),
			DNAItems.wurtzite_pickaxe = new PickaxeItem(DNAToolMaterials.wurtzite, 1, -2.8f, new Item.Properties().group(DNA)).setRegistryName(location("wurtzite_pickaxe")),
			DNAItems.wurtzite_shovel = new ShovelItem(DNAToolMaterials.wurtzite, -1.0f, -2.6f, new Item.Properties().group(DNA)).setRegistryName(location("wurtzite_shovel")),
			DNAItems.wurtzite_sword = new SwordItem(DNAToolMaterials.wurtzite, 9, -3.2f, new Item.Properties().group(DNA)).setRegistryName(location("wurtzite_sword")),
			DNAItems.oxmium_extractor = new OxmiumExtractor(DNAToolMaterials.oxmium, 1, -2.8f, new Item.Properties().group(DNA)).setRegistryName(location("oxmium_extractor")),
			DNAItems.oxmium_sword = new OxmiumSword(DNAToolMaterials.oxmium, 9, -2.0f, new Item.Properties().group(DNA)).setRegistryName(location("oxmium_sword")),
				
			DNAItems.fullerite_helmet = new ArmorItem(DNAArmorMaterials.fullerite, EquipmentSlotType.HEAD, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_helmet")),
			DNAItems.fullerite_chestplate = new ArmorItem(DNAArmorMaterials.fullerite, EquipmentSlotType.CHEST, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_chestplate")),
			DNAItems.fullerite_leggings = new ArmorItem(DNAArmorMaterials.fullerite, EquipmentSlotType.LEGS, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_leggings")),
			DNAItems.fullerite_boots = new ArmorItem(DNAArmorMaterials.fullerite, EquipmentSlotType.FEET, new Item.Properties().group(DNA)).setRegistryName(location("fullerite_boots")),	
			
			DNAItems.fossil_ore = new BlockItem(DNABlocks.fossil_ore, new Item.Properties().group(DNA)).setRegistryName(DNABlocks.fossil_ore.getRegistryName()),
			DNAItems.fullerite_ore = new BlockItem(DNABlocks.fullerite_ore, new Item.Properties().group(DNA)).setRegistryName(DNABlocks.fullerite_ore.getRegistryName()),
			DNAItems.fullerite_ore_nether = new BlockItem(DNABlocks.fullerite_ore_nether, new Item.Properties().group(DNA)).setRegistryName(DNABlocks.fullerite_ore_nether.getRegistryName()),
			DNAItems.wurtzite_ore = new BlockItem(DNABlocks.wurtzite_ore, new Item.Properties().group(DNA)).setRegistryName(DNABlocks.wurtzite_ore.getRegistryName()),
			DNAItems.wurtzite_ore_nether = new BlockItem(DNABlocks.wurtzite_ore_nether, new Item.Properties().group(DNA)).setRegistryName(DNABlocks.wurtzite_ore_nether.getRegistryName()),
			DNAItems.oxmium_ore = new BlockItem(DNABlocks.oxmium_ore, new Item.Properties().group(DNA)).setRegistryName(DNABlocks.oxmium_ore.getRegistryName())
		);
		
		DNAEntities.registerEntitySpawnEggs(event);
		
		LOGGER.info("Items registered.");
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll
		(    
			DNABlocks.fossil_ore = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.AXE).harvestLevel(2).hardnessAndResistance(20.0f, 10.0f).sound(SoundType.WOOD)).setRegistryName(location("fossil_ore")),
			DNABlocks.fullerite_ore = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(3).hardnessAndResistance(15.0f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("fullerite_ore")),
			DNABlocks.fullerite_ore_nether = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(3).hardnessAndResistance(15.0f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("fullerite_ore_nether")),
			DNABlocks.wurtzite_ore = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(4).hardnessAndResistance(25.0f, 40.0f).lightValue(5).sound(SoundType.STONE)).setRegistryName(location("wurtzite_ore")),
			DNABlocks.wurtzite_ore_nether = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(4).hardnessAndResistance(25.0f, 40.0f).lightValue(5).sound(SoundType.STONE)).setRegistryName(location("wurtzite_ore_nether")),
			DNABlocks.oxmium_ore = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.SHOVEL).harvestLevel(5).hardnessAndResistance(3.0f, 10.0f).lightValue(3).sound(SoundType.SAND)).setRegistryName(location("oxmium_ore"))
		);
		
		LOGGER.info("Blocks registered.");
	}
	
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
	{
		event.getRegistry().registerAll
		(           
				DNAEntities.MUMMY
		);	
		
		DNAEntities.registerEntityWorldSpawns();
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}
