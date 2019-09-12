package kan3.dnamod.items.tools;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class OxmiumSword extends SwordItem 
{

	public OxmiumSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		this.getDefaultInstance().addEnchantment(Enchantments.LOOTING, 6);
	}
}
