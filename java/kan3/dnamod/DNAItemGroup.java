package kan3.dnamod;

import kan3.dnamod.init.DNAItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DNAItemGroup extends ItemGroup {

	public DNAItemGroup() 
	{
		super("dna");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(DNAItems.tutorial_item);
	}
}
