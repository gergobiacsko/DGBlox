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
import dylangore.mod.blox.ModBlocks.DGCobbleBlock;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock_Item;

//Mod Info
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "1.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DGBlox {
	// * Defining Blocks, Items and Creative Tabs using a "public static"
	//Creative Tab
	public static CreativeTabs DGTab = new DGTab("BloxTab");
	//Stone Block
	public static int DGStoneBlockId = 502;
	public static Block DGStoneBlock = new DGStoneBlock(DGStoneBlockId).setHardness(1.5F).setResistance(10.0F);
	private static final String[] DGStoneBlockNames = { "White Stone",
		"Orange Stone", "Magenta Stone", "Light Blue Stone",
		"Yellow Stone", "Light Green Stone", "Pink Stone",
		"Dark Gray Stone", "Light Gray Stone", "Cyan Stone",
		"Purple Stone", "Blue Stone", "Brown Stone", "Green Stone",
		"Red Stone", "Black Stone" };
	//Cobble Block
	public static int DGCobbleBlockId = 503;
	public static Block DGCobbleBlock = new DGCobbleBlock(DGCobbleBlockId).setHardness(1.5F).setResistance(10.0F);
	private static final String[] DGCobbleBlockNames = { "White Cobblestone",
		"Orange Cobblestone", "Magenta Cobblestone", "Light Blue Cobblestone",
		"Yellow Cobblestone", "Light Green Cobblestone", "Pink Cobblestone",
		"Dark Gray Cobblestone", "Light Gray Cobblestone", "Cyan Cobblestone",
		"Purple Cobblestone", "Blue Cobblestone", "Brown Cobblestone", "Green Cobblestone",
		"Red Cobblestone", "Black Cobblestone" };

	@Mod.Init
	public void load(FMLInitializationEvent event) {

		// Colored Stone
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
					DGStoneBlockNames[DGStoneStackWhite.getItemDamage()]);
			FurnaceRecipes.smelting().addSmelting(DGStoneBlock.blockID, 0, VanStone , 0.1f);

			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 1),
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

		// Colored Cobblestone
		GameRegistry.registerBlock(DGCobbleBlock, DGCobbleBlock_Item.class,
				"DG_Cobble");

		for (int ix = 0; ix < 16; ix++) {
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
			// Colored Cobble Stacks
			ItemStack DGCobbleStackWhite = new ItemStack(DGCobbleBlock, 1, ix);
			// Colored Cobble Blocks
			ItemStack CobbleWhite = new ItemStack(Block.cobblestone, 1, ix);
			ItemStack CobbleOrange = new ItemStack(Block.cobblestone, 2, ix);
			ItemStack CobbleMagenta = new ItemStack(Block.cobblestone, 3, ix);
			ItemStack CobbleLightBlue = new ItemStack(Block.cobblestone, 4, ix);
			ItemStack CobbleYellow = new ItemStack(Block.cobblestone, 5, ix);
			ItemStack CobbleLightGreen = new ItemStack(Block.cobblestone, 6, ix);
			ItemStack CobblePink = new ItemStack(Block.cobblestone, 7, ix);
			ItemStack CobbleDarkGrey = new ItemStack(Block.cobblestone, 8, ix);
			ItemStack CobbleLightGrey = new ItemStack(Block.cobblestone, 9, ix);
			ItemStack CobbleCyan = new ItemStack(Block.cobblestone, 10, ix);
			ItemStack CobblePurple = new ItemStack(Block.cobblestone, 11, ix);
			ItemStack CobbleBlue = new ItemStack(Block.cobblestone, 12, ix);
			ItemStack CobbleBrown = new ItemStack(Block.cobblestone, 13, ix);
			ItemStack CobbleGreen = new ItemStack(Block.cobblestone, 14, ix);
			ItemStack CobbleRed = new ItemStack(Block.cobblestone, 15, ix);
			ItemStack CobbleBlack = new ItemStack(Block.cobblestone, 16, ix);

			// * White Stone
			LanguageRegistry.addName(DGCobbleStackWhite,
					DGCobbleBlockNames[DGCobbleStackWhite.getItemDamage()]);
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 0),
					CobbleWhite, DyeWhite);

			// * Orange Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 1),
					CobbleOrange, DyeOrange);

			// * Magenta Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 2),
					CobbleMagenta, DyeMagenta);

			// * Light Blue Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 3),
					CobbleLightBlue, DyeLightBlue);

			// * Yellow Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 4),
					CobbleYellow, DyeYellow);

			// * Light Green Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 5),
					CobbleLightGreen, DyeLightGreen);

			// * Pink Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 6),
					CobblePink, DyePink);

			// * Dark Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 7),
					CobbleDarkGrey, DyeDarkGrey);

			// * Light Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 8),
					CobbleLightGrey, DyeLightGrey);

			// * Cyan Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 9),
					CobbleCyan, DyeCyan);

			// * Purple Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 10),
					CobblePurple, DyePurple);

			// * Blue Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 11),
					CobbleBlue, DyeBlue);

			// * Brown Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 12),
					CobbleBrown, DyeBrown);

			// * Green (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 13),
					CobbleGreen, DyeGreen);

			// * Red Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 14),
					CobbleRed, DyeRed);

			// * Black Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 15),
					CobbleDarkGrey, DyeDarkGrey);
		}
			// * Language Registry (Registering Names, tooltips, etc.
			LanguageRegistry.instance().addStringLocalization("itemGroup.BloxTab",
					"en_US", "DG Colored Blox");
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