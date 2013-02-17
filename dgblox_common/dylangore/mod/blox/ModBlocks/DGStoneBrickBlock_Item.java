package dylangore.mod.blox.ModBlocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class DGStoneBrickBlock_Item extends ItemBlock {
	
	private final static String[] subNames = {
		"white", "orange",  "magenta", "lightBlue", "yellow", "lightGreen",
		"pink", "darkGray", "lightGray", "cyan", "purple", "blue", "brown",
		"green", "red", "black"};

	public DGStoneBrickBlock_Item(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("DGStoneBrickBlock_Item");
	}
	
	@Override
	public int getMetadata (int damageValue) {
		return damageValue;
	}
	
	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + subNames[itemstack.getItemDamage()];
	}

}
