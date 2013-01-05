package dylangore.mod.blox.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.ModBlocks.DGStoneBlock;
import dylangore.mod.blox.ModBlocks.DGStoneBlock_Item;
import dylangore.mod.blox.DGBlox;;

public class ColoredStoneRecipes {
	public static void regColoredCobbleBlock(){
		
	}
	public static void addColoredStoneRecipes(){

		for (int ix = 0; ix < 16; ix++) {
			// Misc.
			ItemStack VanStone = new ItemStack(Block.stone);
			// Dyes
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
			Block DGStoneBlock = dylangore.mod.blox.DGBlox.blockStone;
			// Colored Stone
			ItemStack DGStoneStack = new ItemStack(DGStoneBlock, 1, ix);


			LanguageRegistry.addName(DGStoneStack,dylangore.mod.blox.DGBlox.DGStoneBlockNames[DGStoneStack.getItemDamage()]);
			// * White Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 0),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone,DyeWhite);

			// * Orange Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 1),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeOrange);

			// * Magenta Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 2),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeMagenta);

			// * Light Blue Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 3),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightBlue);

			// * Yellow Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 4),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeYellow);

			// * Lime Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 5),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLime);

			// * Pink Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 6),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyePink);

			// * Dark Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 7),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeDarkGrey);

			// * Light Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 8),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightGrey);

			// * Cyan Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 9),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeCyan);

			// * Purple Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 10),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyePurple);

			// * Blue Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 11),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,

					Block.stone,Block.stone, DyeBlue);

			// * Brown Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 12),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeBrown);

			// * Green (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 13),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeGreen);

			// * Red Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 14),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeRed);

			// * Black Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 15),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeBlack);
		}
		
	}
}
