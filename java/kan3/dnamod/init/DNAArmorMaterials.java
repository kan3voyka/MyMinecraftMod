package kan3.dnamod.init;

import kan3.dnamod.DNAMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum DNAArmorMaterials implements IArmorMaterial 
{
	fullerite("fullerite", 40, new int[]{4, 6, 8, 4}, 15, DNAItems.fullerite_ingot, "item.armor.equip_diamond", 2.5f) ;
	
	private static final int[] max_damage_array = new int[]{12, 15, 16, 13};
	private String name, equipSound;
	private int durability, enchantability;
	private int[] damageReductionAmount;
	private Item repairItem;
	private float toughness;
	
	private DNAArmorMaterials(String name, int durability, int[] damageReductionAmount, int enchantability, Item repairItem, String equipSound, float toughness)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.damageReductionAmount = damageReductionAmount;
		this.repairItem = repairItem;
		this.toughness = toughness;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) 
	{
		return this.damageReductionAmount[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public String getName() 
	{
		return DNAMod.MODID + ":" + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
	
}
