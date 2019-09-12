package kan3.dnamod.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum DNAToolMaterials implements IItemTier 
{
	fullerite(6.0f, 12.0f, 1920, 4, 16, DNAItems.fullerite_ingot),
	wurtzite(10.0f, 16.0f, 2560, 5, 20, DNAItems.wurtzite_ingot),
	oxmium(2.0f, 20.0f, 16, 6, 28, DNAItems.oxmium_crystal);
	
	private float attackDamage, efficency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private DNAToolMaterials(float attackDamage, float efficency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {

		this.attackDamage = attackDamage;
		this.efficency = efficency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficency;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel() 
	{
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() 
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
