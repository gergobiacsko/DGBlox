package dylangore.mod.blox.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.ModBlocks.DGStoneBrickBlock_Item;
import dylangore.mod.blox.ModBlocks.DGStoneBrickBlock;
import dylangore.mod.blox.DGBlox;
public class ColoredStoneBrick {
	public static void registerBlockColoredStoneBrick(){
		
	}
	public static void addColoredStoneBrickRecipes(){


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
			Block DGStoneBrickBlock = dylangore.mod.blox.DGBlox.blockStoneBrick;
			// Colored StoneBrick
			ItemStack DGStoneBrickStack = new ItemStack(DGStoneBrickBlock , 1, ix);
			// * White
			LanguageRegistry.addName(DGStoneBrickStack,
					dylangore.mod.blox.DGBlox.DGStoneBrickBlockNames[DGStoneBrickStack.getItemDamage()]);
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 0),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,DyeWhite);
			// * Orange
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 1),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeOrange);
			// * Magenta
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 2),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeMagenta);
			// * LightBlue
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 3),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeLightBlue);
			// * Yellow
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 4),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeYellow);
			// * Lime
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 5),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeLime);
			// * Pink
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 6),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyePink);
			// * DarkGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 7),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeDarkGrey);
			// * LightGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 8),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeLightGrey);
			// * Cyan
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 9),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeCyan);
			// * Purple
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 10),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyePurple);
			// * Blue
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 11),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeBlue);
			// * Brown
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 12),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeBrown);
			// * Green
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 13),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeGreen);
			// * Red 
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 14),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeRed);
			// * Black 
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBrickBlock, 8, 15),
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick,Block.stoneBrick,
					Block.stoneBrick,Block.stoneBrick, DyeBlack);
		}
	}
}
