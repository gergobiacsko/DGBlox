package dylangore.mod.blox;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.Misc.DGTab;
import dylangore.mod.blox.ModBlocks.DGStoneBlock;
import dylangore.mod.blox.ModBlocks.DGStoneBlock_Item;

//Mod Info
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "1.02")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DGBlox {
	// * Defining Blocks, Items and Creative Tabs using a "public static"

	public static CreativeTabs DGTab = new DGTab("BloxTab");
	public static int DGStoneBlockId = 502;
	public static Block DGStoneBlock = new DGStoneBlock(DGStoneBlockId)
			.setHardness(1.5F).setResistance(10.0F);

	private static final String[] multiBlockNames = { "White Stone",
			"Orange Stone", "Magenta Stone", "Light Blue Stone",
			"Yellow Stone", "Light Green Stone", "Pink Stone",
			"Dark Gray Stone", "Light Gray Stone", "Cyan Stone",
			"Purple Stone", "Blue Stone", "Brown Stone", "Green Stone",
			"Red Stone", "Black Stone" };

	@Mod.Init
	public void load(FMLInitializationEvent event) {
		
		// * Colored Stone
		GameRegistry.registerBlock(DGStoneBlock, DGStoneBlock_Item.class,
				"DG_Stone");

		for (int ix = 0; ix < 16; ix++) {
			// Misc.
			ItemStack VanStone = new ItemStack(Block.stone);
			// Dyes (Change Ids)
			ItemStack DyeWhite = new ItemStack(Item.dyePowder, 1, 15);
			ItemStack DyeOrange = new ItemStack(Item.dyePowder, 1, 14);
			ItemStack DyeMagenta = new ItemStack(Item.dyePowder, 1, 13);
			ItemStack DyeLightBlue = new ItemStack(Item.dyePowder, 1, 12);
			ItemStack DyeYellow = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeLightGreen = new ItemStack(Item.dyePowder, 1, 2);
			ItemStack DyePink = new ItemStack(Item.dyePowder, 1, 9);
			ItemStack DyeDarkGrey = new ItemStack(Item.dyePowder, 1, 8);
			ItemStack DyeLightGrey = new ItemStack(Item.dyePowder, 1, 7);
			ItemStack DyeCyan = new ItemStack(Item.dyePowder, 1, 6);
			ItemStack DyePurple = new ItemStack(Item.dyePowder, 1, 5);
			ItemStack DyeBlue = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeBrown = new ItemStack(Item.dyePowder, 1, 3);
			ItemStack DyeGreen = new ItemStack(Item.dyePowder, 1, 4);
			ItemStack DyeRed = new ItemStack(Item.dyePowder, 1, 1);
			ItemStack DyeBlack = new ItemStack(Item.dyePowder, 1, ix);
			// Colored Stone Stacks
			ItemStack DGStoneStackWhite = new ItemStack(DGStoneBlock, 1, ix);
			ItemStack DGStoneStackOrange = new ItemStack(DGStoneBlock, 2, ix);
			ItemStack DGStoneStackMagenta = new ItemStack(DGStoneBlock, 3, ix);
			ItemStack DGStoneStackLightBlue = new ItemStack(DGStoneBlock, 4, ix);
			ItemStack DGStoneStackYellow = new ItemStack(DGStoneBlock, 5, ix);
			ItemStack DGStoneStackLightGreen = new ItemStack(DGStoneBlock, 6,
					ix);
			ItemStack DGStoneStackPink = new ItemStack(DGStoneBlock, 7, ix);
			ItemStack DGStoneStackDarkGrey = new ItemStack(DGStoneBlock, 8, ix);
			ItemStack DGStoneStackLightGrey = new ItemStack(DGStoneBlock, 9, ix);
			ItemStack DGStoneStackCyan = new ItemStack(DGStoneBlock, 10, ix);
			ItemStack DGStoneStackPurple = new ItemStack(DGStoneBlock, 11, ix);
			ItemStack DGStoneStackBlue = new ItemStack(DGStoneBlock, 12, ix);
			ItemStack DGStoneStackBrown = new ItemStack(DGStoneBlock, 13, ix);
			ItemStack DGStoneStackGreen = new ItemStack(DGStoneBlock, 14, ix);
			ItemStack DGStoneStackRed = new ItemStack(DGStoneBlock, 15, ix);
			ItemStack DGStoneStackBlack = new ItemStack(DGStoneBlock, 16, ix);
			// Colored Stone Blocks
			ItemStack StoneWhite = new ItemStack(Block.stone, 1, ix);
			ItemStack StoneOrange = new ItemStack(Block.stone, 2, ix);
			ItemStack StoneMagenta = new ItemStack(Block.stone, 3, ix);
			ItemStack StoneLightBlue = new ItemStack(Block.stone, 4, ix);
			ItemStack StoneYellow = new ItemStack(Block.stone, 5, ix);
			ItemStack StoneLightGreen = new ItemStack(Block.stone, 6, ix);
			ItemStack StonePink = new ItemStack(Block.stone, 7, ix);
			ItemStack StoneDarkGrey = new ItemStack(Block.stone, 8, ix);
			ItemStack StoneLightGrey = new ItemStack(Block.stone, 9, ix);
			ItemStack StoneCyan = new ItemStack(Block.stone, 10, ix);
			ItemStack StonePurple = new ItemStack(Block.stone, 11, ix);
			ItemStack StoneBlue = new ItemStack(Block.stone, 12, ix);
			ItemStack StoneBrown = new ItemStack(Block.stone, 13, ix);
			ItemStack StoneGreen = new ItemStack(Block.stone, 14, ix);
			ItemStack StoneRed = new ItemStack(Block.stone, 15, ix);
			ItemStack StoneBlack = new ItemStack(Block.stone, 16, ix);

			// * White Stone
			LanguageRegistry.addName(DGStoneStackWhite,
					multiBlockNames[DGStoneStackWhite.getItemDamage()]);
			FurnaceRecipes.smelting().addSmelting(DGStoneBlock.blockID, 0, VanStone , 0.1f);

			GameRegistry.addShapelessRecipe(new ItemStack(Block.stone, 1, 1),
					StoneWhite, DyeWhite);

			// * Orange Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 1),
					StoneOrange, DyeOrange);

			// * Magenta Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 2),
					StoneMagenta, DyeMagenta);

			// * Light Blue Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 3),
					StoneLightBlue, DyeLightBlue);

			// * Yellow Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 4),
					StoneYellow, DyeYellow);

			// * Light Green Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 5),
					StoneLightGreen, DyeLightGreen);

			// * Pink Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 6),
					StonePink, DyePink);

			// * Dark Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 7),
					StoneDarkGrey, DyeDarkGrey);

			// * Light Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 8),
					StoneLightGrey, DyeLightGrey);

			// * Cyan Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 9),
					StoneCyan, DyeCyan);

			// * Purple Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 10),
					StonePurple, DyePurple);

			// * Blue Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 11),
					StoneBlue, DyeBlue);

			// * Brown Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 12),
					StoneBrown, DyeBrown);

			// * Green (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 13),
					StoneGreen, DyeGreen);

			// * Red Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 14),
					StoneRed, DyeRed);

			// * Black Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 15),
					StoneDarkGrey, DyeDarkGrey);

		}
if (dylangore.mod.blox.ModBlocks.DGStoneBlock.BloxTabEnabled = true) {
		// * Language Registry (Registering Names, tooltips, etc.
		LanguageRegistry.instance().addStringLocalization("itemGroup.BloxTab",
				"en_US", "DG Colored Blox");
			}
else {
	System.out.println("'DG Blox' Creative Tab has been disabled!");
}
	}

	@Mod.PreInit
	public void config(FMLPreInitializationEvent event) {
		// Config File
		 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		 config.load();
		int DGStoneBlockID = config.getBlock("Colored Stone" , 502 ).getInt();
		boolean BloxTabEnabled = config.get("Settings", "Enable the DGBlox Creative Tab (Currently does not do anything )", true).getBoolean(true);
		config.save();
		
	//Console Print
		System.out.println("DylanGore's Blox Mod has been loaded successfuly");
	}
}