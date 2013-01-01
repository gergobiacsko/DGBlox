package dylangore.mod.blox.Misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import dylangore.mod.blox.DGBlox;



public class DGTab extends CreativeTabs 
{

	public DGTab(String label) {
	    super(label);
	}
	@Override
	public ItemStack getIconItemStack() {
	    return new ItemStack(DGBlox.DGStoneBlock);
	}

}