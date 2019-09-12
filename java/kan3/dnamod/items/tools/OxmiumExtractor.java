package kan3.dnamod.items.tools;

import kan3.dnamod.init.DNAItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class OxmiumExtractor extends PickaxeItem 
{	
	public OxmiumExtractor(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) 
	{
		super(tier, attackDamageIn, attackSpeedIn, builder
				.addToolType(ToolType.PICKAXE, tier.getHarvestLevel())
				.addToolType(ToolType.AXE, tier.getHarvestLevel())
				.addToolType(ToolType.SHOVEL, tier.getHarvestLevel()));
	}	
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack getDefaultInstance() 
	{
		ItemStack stack = new ItemStack(DNAItems.oxmium_extractor);
		stack.addEnchantment(Enchantments.FORTUNE, 6);
		return stack;
	}	
}
