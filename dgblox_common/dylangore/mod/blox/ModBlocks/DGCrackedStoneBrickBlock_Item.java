package dylangore.mod.blox.ModBlocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class DGCrackedStoneBrickBlock_Item extends ItemBlock {
	
	private final static String[] subNames = {"crackedWhite", "crackedOrange",  "crackedMagenta", "crackedLightBlue", "crackedYellow", "crackedLightGreen",
		"crackedPink", "crackedDarkGray", "crackedLightGray", "crackedCyan", "crackedPurple", "crackedBlue", "crackedBrown",
		"crackedGreen", "crackedRed", "crackedBlack"};

	public DGCrackedStoneBrickBlock_Item(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("DGCrackedStoneBrickBlock_Item");
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
