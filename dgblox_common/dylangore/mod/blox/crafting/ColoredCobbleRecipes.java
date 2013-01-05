package dylangore.mod.blox.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock_Item;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock;
import dylangore.mod.blox.DGBlox;
public class ColoredCobbleRecipes {
	public static void registerBlockColoredCobble(){
		
	}
	public static void addColoredCobbleRecipes(){


		for (int ix = 0; ix < 16; ix++) {
			// Dyes (Change Ids)
			ItemStack DyeWhite = new ItemStack(Item.dyePowder, 1, 15);
			ItemStack DyeOrange = new ItemStack(Item.dyePowder, 1, 14);
			ItemStack DyeMagenta = new ItemStack(Item.dyePowder, 1, 13);
			ItemStack DyeLightBlue = new ItemStack(Item.dyePowder, 1, 12);
			ItemStack DyeYellow = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeLime = new ItemStack(Item.dyePowder, 1, 10);
			ItemStack DyePink = new ItemStack(Item.dyePowder, 1, 9);
			ItemStack DyeDarkGrey = new ItemStack(Item.dyePowder, 1, 8);
			ItemStack DyeLightGrey = new ItemStack(Item.dyePowder, 1, 7);
			ItemStack DyeCyan = new ItemStack(Item.dyePowder, 1, 6);
			ItemStack DyePurple = new ItemStack(Item.dyePowder, 1, 5);
			ItemStack DyeBlue = new ItemStack(Item.dyePowder, 1, 4);
			ItemStack DyeBrown = new ItemStack(Item.dyePowder, 1, 3);
			ItemStack DyeGreen = new ItemStack(Item.dyePowder, 1, 2);
			ItemStack DyeRed = new ItemStack(Item.dyePowder, 1, 1);
			ItemStack DyeBlack = new ItemStack(Item.dyePowder, 1);
			Block DGCobbleBlock = dylangore.mod.blox.DGBlox.blockCobble;
			// Colored Cobble
			ItemStack DGCobbleStack = new ItemStack(DGCobbleBlock , 1, ix);
			// * White
			LanguageRegistry.addName(DGCobbleStack,
					dylangore.mod.blox.DGBlox.DGCobbleBlockNames[DGCobbleStack.getItemDamage()]);
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 0),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,DyeWhite);
			// * Orange
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 1),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeOrange);
			// * Magenta
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 2),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeMagenta);
			// * LightBlue
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 3),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeLightBlue);
			// * Yellow
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 4),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeYellow);
			// * Lime
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 5),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeLime);
			// * Pink
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 6),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyePink);
			// * DarkGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 7),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeDarkGrey);
			// * LightGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 8),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeLightGrey);
			// * Cyan
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 9),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeCyan);
			// * Purple
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 10),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyePurple);
			// * Blue
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 11),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeBlue);
			// * Brown
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 12),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeBrown);
			// * Green
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 13),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeGreen);
			// * Red 
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 14),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeRed);
			// * Black 
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 8, 15),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeBlack);
		}
	}
}
