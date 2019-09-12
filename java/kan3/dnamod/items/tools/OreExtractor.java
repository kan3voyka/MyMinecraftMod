package kan3.dnamod.items.tools;

import kan3.dnamod.init.DNAItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;

public class OreExtractor extends PickaxeItem 
{

	public OreExtractor(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder.addToolType(ToolType.PICKAXE, tier.getHarvestLevel()));
	}
	
	@Override
	public ItemStack getDefaultInstance() 
	{
		ItemStack stack = new ItemStack(DNAItems.ore_extractor);
		stack.addEnchantment(Enchantments.SILK_TOUCH, 1);
		return getDefaultInstance();
	}
}
